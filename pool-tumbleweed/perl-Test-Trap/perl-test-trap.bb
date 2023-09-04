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

RPM_NAME = "perl-Test-Trap-0.3.5-1.4.noarch.rpm"
RPM_HASH = "c1072cf4adc57b5ce08b9b252a7956d68f414ac51d850b57d14146fcc1e71a60f8fa8066191dddb12b96a3c1e0292e83d81274193b3bfa4a4464154b1769302e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Trap \
perl-Test--Trap--Builder \
perl-Test--Trap--Builder--PerlIO \
perl-Test--Trap--Builder--SystemSafe \
perl-Test--Trap--Builder--TempFile \
perl-Test-Trap"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Data--Dump \
perl-Test--Tester \
perl-version"

inherit rpm
