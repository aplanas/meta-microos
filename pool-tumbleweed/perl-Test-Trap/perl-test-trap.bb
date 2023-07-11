SUMMARY = "Trap exit codes, exceptions, output, etc"
DESCRIPTION = "Primarily (but not exclusively) for use in test scripts: A block eval on \
steroids, configurable and extensible, but by default trapping (Perl) \
STDOUT, STDERR, warnings, exceptions, would-be exit codes, and return \
values from boxed blocks of test code. \
 \
The values collected by the latest trap can then be queried or tested \
through a special trap object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.3.5"

RPM_NAME = "perl-Test-Trap-0.3.5-1.3.noarch.rpm"
RPM_HASH = "4f9ac7006e41bab186f3bf746fde20f9429e94f2fbbb07f1c455389d6e9508ede622fbddc70f43b447a4bb097ed83b77d5430b2023dffb0ebc5f080e9a7d0b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Trap \
perl-Test--Trap--Builder \
perl-Test--Trap--Builder--PerlIO \
perl-Test--Trap--Builder--SystemSafe \
perl-Test--Trap--Builder--TempFile \
perl-Test-Trap"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Data--Dump \
perl-Test--Tester \
perl-version"

inherit rpm
