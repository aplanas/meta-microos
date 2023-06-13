SUMMARY = "Performance Co-Pilot run-time libraries"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time libraries"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp3-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "082573c189f4c879a7c278b5c9db0e8f508bc3365161de2931d588e965b1fc88a8318246bf10275832b8a1496ff811b55748668d0044b2780e1ff7217979a27d"

RPROVIDES:${PN} += "libpcp.so.3()(64bit) \
libpcp3 \
libpcp3(aarch-64) \
libpcp_pmda.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libsasl2.so.3()(64bit) \
libssl3.so()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
pcp-conf"

inherit rpm
