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

RPM_NAME = "perl-NKF-2.1.5-1.19.aarch64.rpm"
RPM_HASH = "1f3bf310d66845f6f03a77652b0d4c72593e8a2c7356e207d526ca3374482d06311623d2fcc4672a330acafaafb8e94d3bfc159e8f384404a4db389fec54abf2"

RPROVIDES:${PN} += "perl-NKF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
