SUMMARY = "Pseudo ttys and constants"
DESCRIPTION = "'IO::Tty' is used internally by 'IO::Pty' to create a pseudo-tty. You \
wouldn't want to use it directly except to import constants, use 'IO::Pty'. \
For a list of importable constants, see IO::Tty::Constant. \
 \
Windows is now supported, but ONLY under the Cygwin environment, see \
http://sources.redhat.com/cygwin/. \
 \
Please note that pty creation is very system-dependend. From my experience, \
any modern POSIX system should be fine. Find below a list of systems that \
'IO::Tty' should work on. A more detailed table (which is slowly getting \
out-of-date) is available from the project pages document manager at \
SourceForge http://sourceforge.net/projects/expectperl/. \
 \
If you have problems on your system and your system is listed in the \
'verified' list, you probably have some non-standard setup, e.g. you \
compiled your Linux-kernel yourself and disabled ptys (bummer!). Please ask \
your friendly sysadmin for help. \
 \
If your system is not listed, unpack the latest version of 'IO::Tty', do a \
''perl Makefile.PL; make; make test; uname -a'' and send me \
(_RGiersig@cpan.org_) the results and I'll see what I can deduce from that. \
There are chances that it will work right out-of-the-box... \
 \
If it's working on your system, please send me a short note with details \
(version number, distribution, etc. 'uname -a' and 'perl -V' is a good \
start; also, the output from 'perl Makefile.PL' contains a lot of \
interesting info, so please include that as well) so I can get an overview. \
Thanks!"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.17"

RPM_NAME = "perl-IO-Tty-1.17-1.2.aarch64.rpm"
RPM_HASH = "794a939e7f5be187a72637fd53a0d269fe47b9caaec5a2dbaedae00820f94e571ebeedc0e01f64ae8e05ae1b7eec611aab15a8b7cf3de9a75724cac24d7a260b"

RPROVIDES:${PN} += "perl(IO::Pty) \
perl(IO::Tty) \
perl(IO::Tty::Constant) \
perl-IO-Tty \
perl-IO-Tty(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
