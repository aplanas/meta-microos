SUMMARY = "Performance Co-Pilot run-time libraries"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time libraries"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp3-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "83ae7316f3defd8b164291171929d65e837f4ec1017fdd2ee4aed6caaea24579cac174fce98e137bef9e0f8030e669e41ebdb7719afb43229a88212e55d6e942"

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
