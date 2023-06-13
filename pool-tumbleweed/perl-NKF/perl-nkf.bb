SUMMARY = "Perl extension for nkf (Network Kanji Filter)"
DESCRIPTION = "This is a Perl Extension version of nkf (Network Kanji Filter ) 1.9. \
 \
Usage: \
 \
use NKF; $output = nkf($flag,$input); \
 \
$flag has the same meaning as with nkf."
LICENSE = "BSD-3-Clause"

PV = "2.1.5"

RPM_NAME = "perl-NKF-2.1.5-1.18.aarch64.rpm"
RPM_HASH = "bf3e1693b4fded50e83b4ae96776872c7fbf39b0ac44b24af07e4a5d09e9ee59e2481c148659f855c0fd9af9efe8f2013fe879f0dc4f5062c091733feaaa0743"

RPROVIDES:${PN} += "perl(NKF) \
perl-NKF \
perl-NKF(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl"

inherit rpm
