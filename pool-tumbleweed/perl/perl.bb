SUMMARY = "The Perl interpreter"
DESCRIPTION = "perl - Practical Extraction and Report Language \
 \
Perl is optimized for scanning arbitrary text files, extracting \
information from those text files, and printing reports based on that \
information.  It is also good for many system management tasks. Perl is \
intended to be practical (easy to use, efficient, and complete) rather \
than beautiful (tiny, elegant, and minimal). \
 \
Some of the modules available on CPAN can be found in the 'perl' \
series."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.36.0"

RPM_NAME = "perl-5.36.0-4.3.aarch64.rpm"
RPM_HASH = "635d95d5880f9fa7aaf2e027e2bbbb8455d867d3de6d481a82feed96af1995eae27abc6b715a4227fe217aa33c5e3e00021006031e2553928ad2ab60e1ece8b0"

RPROVIDES:${PN} += "libperl.so \
perl \
perl--MODULE-COMPAT-5.36.0 \
perl--charnames \
perl-500 \
perl-AnyDBM-File \
perl-App--Cpan \
perl-App--Prove \
perl-App--Prove--State \
perl-App--Prove--State--Result \
perl-App--Prove--State--Result--Test \
perl-Archive--Tar \
perl-Archive--Tar--Constant \
perl-Archive--Tar--File \
perl-Archive-Tar \
perl-Attribute--Handlers \
perl-AutoSplit \
perl-B--Concise \
perl-B--Op-private \
perl-B--Showlex \
perl-B--Terse \
perl-B--Xref \
perl-Benchmark \
perl-CPAN \
perl-CPAN--Author \
perl-CPAN--Bundle \
perl-CPAN--CacheMgr \
perl-CPAN--Complete \
perl-CPAN--Debug \
perl-CPAN--DeferredCode \
perl-CPAN--Distribution \
perl-CPAN--Distroprefs \
perl-CPAN--Distroprefs--Iterator \
perl-CPAN--Distroprefs--Pref \
perl-CPAN--Distroprefs--Result \
perl-CPAN--Distroprefs--Result--Error \
perl-CPAN--Distroprefs--Result--Fatal \
perl-CPAN--Distroprefs--Result--Success \
perl-CPAN--Distroprefs--Result--Warning \
perl-CPAN--Distrostatus \
perl-CPAN--Eval \
perl-CPAN--Exception--RecursiveDependency \
perl-CPAN--Exception--RecursiveDependency--na \
perl-CPAN--Exception--blocked-urllist \
perl-CPAN--Exception--yaml-not-installed \
perl-CPAN--Exception--yaml-process-error \
perl-CPAN--FTP \
perl-CPAN--FTP--netrc \
perl-CPAN--FirstTime \
perl-CPAN--HTTP--Client \
perl-CPAN--HTTP--Credentials \
perl-CPAN--HandleConfig \
perl-CPAN--Index \
perl-CPAN--InfoObj \
perl-CPAN--Kwalify \
perl-CPAN--LWP--UserAgent \
perl-CPAN--Meta \
perl-CPAN--Meta--Converter \
perl-CPAN--Meta--Feature \
perl-CPAN--Meta--History \
perl-CPAN--Meta--Merge \
perl-CPAN--Meta--Prereqs \
perl-CPAN--Meta--Requirements \
perl-CPAN--Meta--Spec \
perl-CPAN--Meta--Validator \
perl-CPAN--Meta--YAML \
perl-CPAN--Mirrored--By \
perl-CPAN--Mirrors \
perl-CPAN--Module \
perl-CPAN--Nox \
perl-CPAN--Plugin \
perl-CPAN--Plugin--Specfile \
perl-CPAN--Prompt \
perl-CPAN--Queue \
perl-CPAN--Queue--Item \
perl-CPAN--Shell \
perl-CPAN--Tarzip \
perl-CPAN--URL \
perl-CPAN--Version \
perl-CPAN-Meta \
perl-CPAN-Meta-YAML \
perl-Compress--Raw--Bzip2 \
perl-Compress--Raw--Zlib \
perl-Compress--Zlib \
perl-Compress-Raw-Zlib \
perl-Compress-Zlib \
perl-DB \
perl-DB-File \
perl-DB-File--BTREEINFO \
perl-DB-File--HASHINFO \
perl-DB-File--RECNOINFO \
perl-DBM-Filter \
perl-DBM-Filter--compress \
perl-DBM-Filter--encode \
perl-DBM-Filter--int32 \
perl-DBM-Filter--null \
perl-DBM-Filter--utf8 \
perl-Devel--PPPort \
perl-Devel--Peek \
perl-Devel--SelfStubber \
perl-DirHandle \
perl-Dumpvalue \
perl-DynaLoader \
perl-EVERY--LAST \
perl-Encode \
perl-Encode--Alias \
perl-Encode--Byte \
perl-Encode--CJKConstants \
perl-Encode--CN \
perl-Encode--CN--HZ \
perl-Encode--Config \
perl-Encode--EBCDIC \
perl-Encode--Encoder \
perl-Encode--Encoding \
perl-Encode--GSM0338 \
perl-Encode--Guess \
perl-Encode--JP \
perl-Encode--JP--H2Z \
perl-Encode--JP--JIS7 \
perl-Encode--KR \
perl-Encode--KR--2022-KR \
perl-Encode--MIME--Header \
perl-Encode--MIME--Header--ISO-2022-JP \
perl-Encode--MIME--Name \
perl-Encode--Symbol \
perl-Encode--TW \
perl-Encode--UTF-EBCDIC \
perl-Encode--Unicode \
perl-Encode--Unicode--UTF7 \
perl-Encode--XS \
perl-Encode--utf8 \
perl-Env \
perl-Env--Array \
perl-Env--Array--VMS \
perl-ExtUtils--CBuilder \
perl-ExtUtils--CBuilder--Base \
perl-ExtUtils--CBuilder--Platform--Unix \
perl-ExtUtils--CBuilder--Platform--VMS \
perl-ExtUtils--CBuilder--Platform--Windows \
perl-ExtUtils--CBuilder--Platform--Windows--BCC \
perl-ExtUtils--CBuilder--Platform--Windows--GCC \
perl-ExtUtils--CBuilder--Platform--Windows--MSVC \
perl-ExtUtils--CBuilder--Platform--aix \
perl-ExtUtils--CBuilder--Platform--android \
perl-ExtUtils--CBuilder--Platform--cygwin \
perl-ExtUtils--CBuilder--Platform--darwin \
perl-ExtUtils--CBuilder--Platform--dec-osf \
perl-ExtUtils--CBuilder--Platform--os2 \
perl-ExtUtils--Command \
perl-ExtUtils--Command--MM \
perl-ExtUtils--Constant \
perl-ExtUtils--Constant--Base \
perl-ExtUtils--Constant--ProxySubs \
perl-ExtUtils--Constant--Utils \
perl-ExtUtils--Constant--XS \
perl-ExtUtils--Embed \
perl-ExtUtils--Install \
perl-ExtUtils--Install--Warn \
perl-ExtUtils--Installed \
perl-ExtUtils--Liblist \
perl-ExtUtils--Liblist--Kid \
perl-ExtUtils--MM \
perl-ExtUtils--MM-AIX \
perl-ExtUtils--MM-Any \
perl-ExtUtils--MM-BeOS \
perl-ExtUtils--MM-Cygwin \
perl-ExtUtils--MM-DOS \
perl-ExtUtils--MM-Darwin \
perl-ExtUtils--MM-MacOS \
perl-ExtUtils--MM-NW5 \
perl-ExtUtils--MM-OS2 \
perl-ExtUtils--MM-OS390 \
perl-ExtUtils--MM-QNX \
perl-ExtUtils--MM-UWIN \
perl-ExtUtils--MM-Unix \
perl-ExtUtils--MM-VMS \
perl-ExtUtils--MM-VOS \
perl-ExtUtils--MM-Win32 \
perl-ExtUtils--MM-Win95 \
perl-ExtUtils--MY \
perl-ExtUtils--MakeMaker \
perl-ExtUtils--MakeMaker---version \
perl-ExtUtils--MakeMaker--Config \
perl-ExtUtils--MakeMaker--Locale \
perl-ExtUtils--MakeMaker--version \
perl-ExtUtils--Manifest \
perl-ExtUtils--Miniperl \
perl-ExtUtils--Mkbootstrap \
perl-ExtUtils--Mksymlists \
perl-ExtUtils--PL2Bat \
perl-ExtUtils--Packlist \
perl-ExtUtils--ParseXS \
perl-ExtUtils--ParseXS--Constants \
perl-ExtUtils--ParseXS--CountLines \
perl-ExtUtils--ParseXS--Eval \
perl-ExtUtils--ParseXS--Utilities \
perl-ExtUtils--Typemaps \
perl-ExtUtils--Typemaps--Cmd \
perl-ExtUtils--Typemaps--InputMap \
perl-ExtUtils--Typemaps--OutputMap \
perl-ExtUtils--Typemaps--Type \
perl-ExtUtils--testlib \
perl-ExtUtils-CBuilder \
perl-ExtUtils-ParseXS \
perl-Fatal \
perl-FileCache \
perl-Filter--Simple \
perl-Filter--Util--Call \
perl-Filter-Simple \
perl-FindBin \
perl-GDBM-File \
perl-HTTP--Tiny \
perl-Hash--Util \
perl-Hash--Util--FieldHash \
perl-I18N--Collate \
perl-I18N--LangTags \
perl-I18N--LangTags--Detect \
perl-I18N--LangTags--List \
perl-I18N--Langinfo \
perl-I18N-LangTags \
perl-IO--Compress--Adapter--Bzip2 \
perl-IO--Compress--Adapter--Deflate \
perl-IO--Compress--Adapter--Identity \
perl-IO--Compress--Base \
perl-IO--Compress--Base--Common \
perl-IO--Compress--Bzip2 \
perl-IO--Compress--Deflate \
perl-IO--Compress--Gzip \
perl-IO--Compress--Gzip--Constants \
perl-IO--Compress--RawDeflate \
perl-IO--Compress--Zip \
perl-IO--Compress--Zip--Constants \
perl-IO--Compress--Zlib--Constants \
perl-IO--Compress--Zlib--Extra \
perl-IO--Socket--IP \
perl-IO--Uncompress--Adapter--Bunzip2 \
perl-IO--Uncompress--Adapter--Identity \
perl-IO--Uncompress--Adapter--Inflate \
perl-IO--Uncompress--AnyInflate \
perl-IO--Uncompress--AnyUncompress \
perl-IO--Uncompress--Base \
perl-IO--Uncompress--Bunzip2 \
perl-IO--Uncompress--Gunzip \
perl-IO--Uncompress--Inflate \
perl-IO--Uncompress--RawInflate \
perl-IO--Uncompress--Unzip \
perl-IO--Zlib \
perl-IO-Compress-Base \
perl-IO-Compress-Zlib \
perl-IO-Socket-IP \
perl-IO-Zlib \
perl-IPC--Msg \
perl-IPC--Msg--stat \
perl-IPC--Semaphore \
perl-IPC--Semaphore--stat \
perl-IPC--SharedMem \
perl-IPC--SharedMem--stat \
perl-IPC--SysV \
perl-JSON--PP \
perl-JSON--PP--Boolean \
perl-JSON--PP--IncrParser \
perl-Locale--Maketext \
perl-Locale--Maketext--Guts \
perl-Locale--Maketext--GutsLoader \
perl-Locale--Maketext--Simple \
perl-Locale-Maketext-Simple \
perl-MIME--Base64 \
perl-MIME--QuotedPrint \
perl-MIME-Base64 \
perl-MM \
perl-MY \
perl-Math--BigFloat \
perl-Math--BigFloat--Trace \
perl-Math--BigInt \
perl-Math--BigInt--Calc \
perl-Math--BigInt--FastCalc \
perl-Math--BigInt--Lib \
perl-Math--BigInt--Trace \
perl-Math--BigRat \
perl-Math--BigRat--Trace \
perl-Math--Complex \
perl-Math--Trig \
perl-Memoize \
perl-Memoize--AnyDBM-File \
perl-Memoize--Expire \
perl-Memoize--ExpireFile \
perl-Memoize--ExpireTest \
perl-Memoize--NDBM-File \
perl-Memoize--SDBM-File \
perl-Memoize--Storable \
perl-Module--CoreList \
perl-Module--CoreList--Utils \
perl-Module--Load \
perl-Module--Load--Conditional \
perl-Module--Loaded \
perl-Module--Metadata \
perl-NDBM-File \
perl-NEXT \
perl-NEXT--ACTUAL \
perl-NEXT--ACTUAL--DISTINCT \
perl-NEXT--ACTUAL--UNSEEN \
perl-NEXT--DISTINCT \
perl-NEXT--DISTINCT--ACTUAL \
perl-NEXT--UNSEEN \
perl-NEXT--UNSEEN--ACTUAL \
perl-Net--Cmd \
perl-Net--Config \
perl-Net--Domain \
perl-Net--FTP \
perl-Net--FTP--A \
perl-Net--FTP--E \
perl-Net--FTP--I \
perl-Net--FTP--L \
perl-Net--FTP--dataconn \
perl-Net--NNTP \
perl-Net--NNTP---SSL \
perl-Net--Netrc \
perl-Net--POP3 \
perl-Net--POP3---SSL \
perl-Net--Ping \
perl-Net--SMTP \
perl-Net--SMTP---SSL \
perl-Net--Time \
perl-Net--hostent \
perl-Net--netent \
perl-Net--protoent \
perl-Net--servent \
perl-O \
perl-ODBM-File \
perl-Opcode \
perl-Params--Check \
perl-Parse--CPAN--Meta \
perl-Parse-CPAN-Meta \
perl-PathTools \
perl-Perl--OSType \
perl-PerlIO \
perl-PerlIO--encoding \
perl-PerlIO--mmap \
perl-PerlIO--scalar \
perl-PerlIO--via \
perl-PerlIO--via--QuotedPrint \
perl-Pod--Checker \
perl-Pod--Checker--Hyperlink \
perl-Pod--Escapes \
perl-Pod--Functions \
perl-Pod--Html \
perl-Pod--Html--Util \
perl-Pod--Man \
perl-Pod--ParseLink \
perl-Pod--Perldoc \
perl-Pod--Perldoc--BaseTo \
perl-Pod--Perldoc--GetOptsOO \
perl-Pod--Perldoc--ToANSI \
perl-Pod--Perldoc--ToChecker \
perl-Pod--Perldoc--ToMan \
perl-Pod--Perldoc--ToNroff \
perl-Pod--Perldoc--ToPod \
perl-Pod--Perldoc--ToRtf \
perl-Pod--Perldoc--ToTerm \
perl-Pod--Perldoc--ToText \
perl-Pod--Perldoc--ToXml \
perl-Pod--Simple \
perl-Pod--Simple--BlackBox \
perl-Pod--Simple--Checker \
perl-Pod--Simple--Debug \
perl-Pod--Simple--DumpAsText \
perl-Pod--Simple--DumpAsXML \
perl-Pod--Simple--HTML \
perl-Pod--Simple--HTMLBatch \
perl-Pod--Simple--HTMLLegacy \
perl-Pod--Simple--JustPod \
perl-Pod--Simple--LinkSection \
perl-Pod--Simple--Methody \
perl-Pod--Simple--Progress \
perl-Pod--Simple--PullParser \
perl-Pod--Simple--PullParserEndToken \
perl-Pod--Simple--PullParserStartToken \
perl-Pod--Simple--PullParserTextToken \
perl-Pod--Simple--PullParserToken \
perl-Pod--Simple--RTF \
perl-Pod--Simple--Search \
perl-Pod--Simple--SimpleTree \
perl-Pod--Simple--Text \
perl-Pod--Simple--TextContent \
perl-Pod--Simple--TiedOutFH \
perl-Pod--Simple--Transcode \
perl-Pod--Simple--TranscodeDumb \
perl-Pod--Simple--TranscodeSmart \
perl-Pod--Simple--XHTML \
perl-Pod--Simple--XHTML--LocalPodLinks \
perl-Pod--Simple--XMLOutStream \
perl-Pod--Text \
perl-Pod--Text--Color \
perl-Pod--Text--Overstrike \
perl-Pod--Text--Termcap \
perl-Pod--Usage \
perl-Pod-Escapes \
perl-Pod-Simple \
perl-SDBM-File \
perl-Safe \
perl-Search--Dict \
perl-SelfLoader \
perl-Storable \
perl-Sub--Util \
perl-Sys--Hostname \
perl-Sys--Syslog \
perl-TAP--Base \
perl-TAP--Formatter--Base \
perl-TAP--Formatter--Color \
perl-TAP--Formatter--Console \
perl-TAP--Formatter--Console--ParallelSession \
perl-TAP--Formatter--Console--Session \
perl-TAP--Formatter--File \
perl-TAP--Formatter--File--Session \
perl-TAP--Formatter--Session \
perl-TAP--Harness \
perl-TAP--Harness--Env \
perl-TAP--Object \
perl-TAP--Parser \
perl-TAP--Parser--Aggregator \
perl-TAP--Parser--Grammar \
perl-TAP--Parser--Iterator \
perl-TAP--Parser--Iterator--Array \
perl-TAP--Parser--Iterator--Process \
perl-TAP--Parser--Iterator--Stream \
perl-TAP--Parser--IteratorFactory \
perl-TAP--Parser--Multiplexer \
perl-TAP--Parser--Result \
perl-TAP--Parser--Result--Bailout \
perl-TAP--Parser--Result--Comment \
perl-TAP--Parser--Result--Plan \
perl-TAP--Parser--Result--Pragma \
perl-TAP--Parser--Result--Test \
perl-TAP--Parser--Result--Unknown \
perl-TAP--Parser--Result--Version \
perl-TAP--Parser--Result--YAML \
perl-TAP--Parser--ResultFactory \
perl-TAP--Parser--Scheduler \
perl-TAP--Parser--Scheduler--Job \
perl-TAP--Parser--Scheduler--Spinner \
perl-TAP--Parser--Source \
perl-TAP--Parser--SourceHandler \
perl-TAP--Parser--SourceHandler--Executable \
perl-TAP--Parser--SourceHandler--File \
perl-TAP--Parser--SourceHandler--Handle \
perl-TAP--Parser--SourceHandler--Perl \
perl-TAP--Parser--SourceHandler--RawTAP \
perl-TAP--Parser--YAMLish--Reader \
perl-TAP--Parser--YAMLish--Writer \
perl-Term--ANSIColor \
perl-Term--Cap \
perl-Term--Complete \
perl-Term--ReadLine \
perl-Term--ReadLine--Stub \
perl-Term--ReadLine--TermCap \
perl-Term--ReadLine--Tk \
perl-Test \
perl-Test--Builder \
perl-Test--Builder--Formatter \
perl-Test--Builder--IO--Scalar \
perl-Test--Builder--Module \
perl-Test--Builder--Tester \
perl-Test--Builder--Tester--Color \
perl-Test--Builder--Tester--Tie \
perl-Test--Builder--TodoDiag \
perl-Test--Harness \
perl-Test--More \
perl-Test--Simple \
perl-Test--Tester \
perl-Test--Tester--Capture \
perl-Test--Tester--CaptureRunner \
perl-Test--Tester--Delegate \
perl-Test--use--ok \
perl-Test-Harness \
perl-Test-Simple \
perl-Test2 \
perl-Test2--API \
perl-Test2--API--Breakage \
perl-Test2--API--Context \
perl-Test2--API--Instance \
perl-Test2--API--InterceptResult \
perl-Test2--API--InterceptResult--Event \
perl-Test2--API--InterceptResult--Facet \
perl-Test2--API--InterceptResult--Hub \
perl-Test2--API--InterceptResult--Squasher \
perl-Test2--API--Stack \
perl-Test2--Event \
perl-Test2--Event--Bail \
perl-Test2--Event--Diag \
perl-Test2--Event--Encoding \
perl-Test2--Event--Exception \
perl-Test2--Event--Fail \
perl-Test2--Event--Generic \
perl-Test2--Event--Note \
perl-Test2--Event--Ok \
perl-Test2--Event--Pass \
perl-Test2--Event--Plan \
perl-Test2--Event--Skip \
perl-Test2--Event--Subtest \
perl-Test2--Event--TAP--Version \
perl-Test2--Event--V2 \
perl-Test2--Event--Waiting \
perl-Test2--EventFacet \
perl-Test2--EventFacet--About \
perl-Test2--EventFacet--Amnesty \
perl-Test2--EventFacet--Assert \
perl-Test2--EventFacet--Control \
perl-Test2--EventFacet--Error \
perl-Test2--EventFacet--Hub \
perl-Test2--EventFacet--Info \
perl-Test2--EventFacet--Info--Table \
perl-Test2--EventFacet--Meta \
perl-Test2--EventFacet--Parent \
perl-Test2--EventFacet--Plan \
perl-Test2--EventFacet--Render \
perl-Test2--EventFacet--Trace \
perl-Test2--Formatter \
perl-Test2--Formatter--TAP \
perl-Test2--Hub \
perl-Test2--Hub--Interceptor \
perl-Test2--Hub--Interceptor--Terminator \
perl-Test2--Hub--Subtest \
perl-Test2--IPC \
perl-Test2--IPC--Driver \
perl-Test2--IPC--Driver--Files \
perl-Test2--Tools--Tiny \
perl-Test2--Util \
perl-Test2--Util--ExternalMeta \
perl-Test2--Util--Facets2Legacy \
perl-Test2--Util--HashBase \
perl-Test2--Util--Trace \
perl-Text-Balanced \
perl-Thread \
perl-Thread--Queue \
perl-Thread--Semaphore \
perl-Tie--Array \
perl-Tie--File \
perl-Tie--File--Cache \
perl-Tie--File--Heap \
perl-Tie--Handle \
perl-Tie--Hash \
perl-Tie--Hash--NamedCapture \
perl-Tie--Memoize \
perl-Tie--RefHash \
perl-Tie--Scalar \
perl-Tie--StdArray \
perl-Tie--StdHandle \
perl-Tie--StdScalar \
perl-Tie--SubstrHash \
perl-Time--HiRes \
perl-Time--Local \
perl-Time--Piece \
perl-Time--Seconds \
perl-Time--gmtime \
perl-Time--localtime \
perl-Time--tm \
perl-Time-HiRes \
perl-U64 \
perl-UNIVERSAL \
perl-Unicode--Collate \
perl-Unicode--Collate--CJK--Big5 \
perl-Unicode--Collate--CJK--GB2312 \
perl-Unicode--Collate--CJK--JISX0208 \
perl-Unicode--Collate--CJK--Korean \
perl-Unicode--Collate--CJK--Pinyin \
perl-Unicode--Collate--CJK--Stroke \
perl-Unicode--Collate--CJK--Zhuyin \
perl-Unicode--Collate--Locale \
perl-Unicode--Normalize \
perl-Unicode--UCD \
perl-User--grent \
perl-User--pwent \
perl-Zlib--OldDeflate \
perl-Zlib--OldInflate \
perl-autodie \
perl-autodie--Scope--Guard \
perl-autodie--Scope--GuardStack \
perl-autodie--Util \
perl-autodie--exception \
perl-autodie--exception--system \
perl-autodie--hints \
perl-autodie--skip \
perl-autouse \
perl-bigfloat \
perl-bigint \
perl-bignum \
perl-bigrat \
perl-blib \
perl-charnames \
perl-deprecate \
perl-diagnostics \
perl-encoding \
perl-encoding--warnings \
perl-experimental \
perl-filetest \
perl-if \
perl-less \
perl-libnet \
perl-mro \
perl-ok \
perl-open \
perl-ops \
perl-overload--numbers \
perl-perlfaq \
perl-sigtrap \
perl-sort \
perl-subs \
perl-threads \
perl-threads--shared \
perl-version \
perl-version--regex \
perl-vmsish \
rpm-macro-libperl-requires \
rpm-macro-perl-archlib \
rpm-macro-perl-gen-filelist \
rpm-macro-perl-installarchlib \
rpm-macro-perl-installman1dir \
rpm-macro-perl-installman3dir \
rpm-macro-perl-make-install \
rpm-macro-perl-man1dir \
rpm-macro-perl-man1ext \
rpm-macro-perl-man3dir \
rpm-macro-perl-man3ext \
rpm-macro-perl-prefix \
rpm-macro-perl-privlib \
rpm-macro-perl-process-packlist \
rpm-macro-perl-requires \
rpm-macro-perl-sitearch \
rpm-macro-perl-sitelib \
rpm-macro-perl-vendorarch \
rpm-macro-perl-vendorlib \
rpm-macro-perl-version"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypt.so.1 \
libdb-4.8.so \
libgdbm-compat.so.4 \
libgdbm.so.6 \
libm.so.6 \
libz.so.1 \
perl-base"

inherit rpm
