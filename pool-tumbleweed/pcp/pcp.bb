SUMMARY = "System-level performance monitoring and performance management"
DESCRIPTION = "Performance Co-Pilot (PCP) provides a framework and services to support \
system-level performance monitoring and performance management. \
 \
The PCP open source release provides a unifying abstraction for all of \
the interesting performance data in a system, and allows client \
applications to easily retrieve and process any subset of that data."
LICENSE = "GPL-2.0+ & LGPL-2.0+ & CC-BY-SA-3.0"

PV = "5.2.5"

RPM_NAME = "pcp-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "91ba562ed16e0abe5ecd61548b4061ea81995d08861468af9794c42f475e1d6530aed24ee9f54ec06c6bd696d41d5da8f4142a9ae17f6b2312db9956487eabda"

RPROVIDES:${PN} += "config-pcp \
pcp \
pcp-pmda-kvm \
pcp-webapi"

RDEPENDS:${PN} += "/usr/bin/hostname \
/usr/bin/sh \
bash \
cpp \
cyrus-sasl \
fileutils \
findutils \
gawk \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libncursesw.so.6 \
libpcp-gui.so.2 \
libpcp-import.so.1 \
libpcp-mmv.so.1 \
libpcp-pmda.so.3 \
libpcp-trace.so.2 \
libpcp-web.so.1 \
libpcp.so.3 \
libpcp3 \
libreadline.so.8 \
libssl.so.3 \
libtinfo.so.6 \
libuv.so.1 \
perl \
permissions \
sed \
systemd \
which"

inherit rpm
