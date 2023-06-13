SUMMARY = "XTRX's fork from myriadrf/LMS7002M-driver"
DESCRIPTION = "XTRX's fork from myriadrf/LMS7002M-driver."
LICENSE = "Apache-2.0"

PV = "0.0.0+git.20171206"

RPM_NAME = "libxtrx_lms7002m0_0_0-SUSE-0.0.0+git.20171206-1.21.aarch64.rpm"
RPM_HASH = "96e54b03693052ed44a743301a2c25f36843f6414a1f6d16caf58ab0551e3e23113f67e571f367dd0ae21c1f96d60398cc4d093e48bb33247b344fb2ee7ccccc"

RPROVIDES:${PN} += "libxtrx_lms7002m.so.0.0.0-SUSE()(64bit) \
libxtrx_lms7002m0_0_0-SUSE \
libxtrx_lms7002m0_0_0-SUSE(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
