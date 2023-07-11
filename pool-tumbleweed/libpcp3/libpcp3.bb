SUMMARY = "Performance Co-Pilot run-time libraries"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time libraries"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp3-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "a9d75a536ff7123c9a139d131d29681371646f96b544f1aeebf79e379fcc392b06f2787bcac8ff61b64ce4e8dd32ea9c43a50e92cc668afafe6945a047fd5399"

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
