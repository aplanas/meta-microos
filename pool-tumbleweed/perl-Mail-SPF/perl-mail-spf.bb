SUMMARY = "An object-oriented implementation of Sender Policy Framework"
DESCRIPTION = "*Mail::SPF* is an object-oriented implementation of Sender Policy Framework \
(SPF). See the http://www.openspf.org manpage for more information about \
SPF. \
 \
This class collection aims to fully conform to the SPF specification (RFC \
4408) so as to serve both as a production quality SPF implementation and as \
a reference for other developers of SPF implementations."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "perl-Mail-SPF-2.9.0-2.16.noarch.rpm"
RPM_HASH = "35c20ca4b3547ec0d2d846540282e841910bf37943100d1d3595e590234ffa673f4620ba8f4f84454e4a5e36718baa402fafeb5e725af46ed0f1989045047fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mail--SPF \
perl-Mail--SPF--Base \
perl-Mail--SPF--EAbstractClass \
perl-Mail--SPF--EClassMethod \
perl-Mail--SPF--EDNSError \
perl-Mail--SPF--EDNSTimeout \
perl-Mail--SPF--EDuplicateGlobalMod \
perl-Mail--SPF--EInstanceMethod \
perl-Mail--SPF--EInvalidMacro \
perl-Mail--SPF--EInvalidMacroString \
perl-Mail--SPF--EInvalidMech \
perl-Mail--SPF--EInvalidMechQualifier \
perl-Mail--SPF--EInvalidMod \
perl-Mail--SPF--EInvalidOptionValue \
perl-Mail--SPF--EInvalidRecordVersion \
perl-Mail--SPF--EInvalidScope \
perl-Mail--SPF--EInvalidTerm \
perl-Mail--SPF--EJunkInRecord \
perl-Mail--SPF--EJunkInTerm \
perl-Mail--SPF--EMacroExpansionCtxRequired \
perl-Mail--SPF--ENoAcceptableRecord \
perl-Mail--SPF--ENoUnparsedText \
perl-Mail--SPF--ENothingToParse \
perl-Mail--SPF--EOptionRequired \
perl-Mail--SPF--EProcessingLimitExceeded \
perl-Mail--SPF--EReadOnlyValue \
perl-Mail--SPF--ERecordSelectionError \
perl-Mail--SPF--ERedundantAcceptableRecords \
perl-Mail--SPF--ESyntaxError \
perl-Mail--SPF--ETermDomainSpecExpected \
perl-Mail--SPF--ETermIPv4AddressExpected \
perl-Mail--SPF--ETermIPv4PrefixLengthExpected \
perl-Mail--SPF--ETermIPv6AddressExpected \
perl-Mail--SPF--ETermIPv6PrefixLengthExpected \
perl-Mail--SPF--EUnexpectedTermObject \
perl-Mail--SPF--Exception \
perl-Mail--SPF--GlobalMod \
perl-Mail--SPF--MacroString \
perl-Mail--SPF--Mech \
perl-Mail--SPF--Mech--A \
perl-Mail--SPF--Mech--All \
perl-Mail--SPF--Mech--Exists \
perl-Mail--SPF--Mech--IP4 \
perl-Mail--SPF--Mech--IP6 \
perl-Mail--SPF--Mech--Include \
perl-Mail--SPF--Mech--MX \
perl-Mail--SPF--Mech--PTR \
perl-Mail--SPF--Mod \
perl-Mail--SPF--Mod--Exp \
perl-Mail--SPF--Mod--Redirect \
perl-Mail--SPF--PositionalMod \
perl-Mail--SPF--Record \
perl-Mail--SPF--Request \
perl-Mail--SPF--Result \
perl-Mail--SPF--Result--Error \
perl-Mail--SPF--Result--Fail \
perl-Mail--SPF--Result--Neutral \
perl-Mail--SPF--Result--NeutralByDefault \
perl-Mail--SPF--Result--None \
perl-Mail--SPF--Result--Pass \
perl-Mail--SPF--Result--PermError \
perl-Mail--SPF--Result--SoftFail \
perl-Mail--SPF--Result--TempError \
perl-Mail--SPF--SenderIPAddrMech \
perl-Mail--SPF--Server \
perl-Mail--SPF--Term \
perl-Mail--SPF--UnknownMod \
perl-Mail--SPF--Util \
perl-Mail--SPF--v1--Record \
perl-Mail--SPF--v2--Record \
perl-Mail-SPF"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Error \
perl-Net--DNS \
perl-NetAddr--IP \
perl-URI \
perl-version"

inherit rpm
