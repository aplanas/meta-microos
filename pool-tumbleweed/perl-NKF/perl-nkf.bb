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

RPM_NAME = "perl-NKF-2.1.5-1.20.aarch64.rpm"
RPM_HASH = "bc32a66ce8d372f56051b35c083abe76de59207a7aa65a5357f6f9855c4bff7467ba0c3fc259ae714ab441f1f9d745e17d6059552ecc545280fa3927ce957a3c"

RPROVIDES:${PN} += "perl-NKF"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
