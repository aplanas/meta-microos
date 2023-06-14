SUMMARY = "Performance Co-Pilot run-time libraries"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time libraries"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp3-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "082573c189f4c879a7c278b5c9db0e8f508bc3365161de2931d588e965b1fc88a8318246bf10275832b8a1496ff811b55748668d0044b2780e1ff7217979a27d"

RPROVIDES:${PN} += "libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libsasl2.so.3 \
libssl3.so \
libsystemd.so.0 \
pcp-conf"

inherit rpm
