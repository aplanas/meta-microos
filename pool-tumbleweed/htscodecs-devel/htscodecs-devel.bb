SUMMARY = "Header files and libraries for compiling against htscodecs"
DESCRIPTION = "Header files and libraries of the samtools project for compiling against htscodecs."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "htscodecs-devel-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "1edcb4b2d5cc161d178b74da89c3cd865ddd649f8125c6fa2f993e0f9765c5a52cf0356679ff136d049aba6bdd1270f62aad644ff6a9f8b78c1f2d22d6757792"

RPROVIDES:${PN} += "htscodecs-devel \
htscodecs-devel(aarch-64)"
RDEPENDS:${PN} += "libhtscodecs2"

inherit rpm
