SUMMARY = "System-level performance monitoring and performance management"
DESCRIPTION = "Performance Co-Pilot (PCP) provides a framework and services to support \
system-level performance monitoring and performance management. \
 \
The PCP open source release provides a unifying abstraction for all of \
the interesting performance data in a system, and allows client \
applications to easily retrieve and process any subset of that data."
LICENSE = "GPL-2.0+ & LGPL-2.0+ & CC-BY-SA-3.0"

PV = "5.2.5"

RPM_NAME = "pcp-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "969307625a6d9e0ef722bbbcd300749ae43eb3b73c0d12b11405943ad41e63f7eeea65276df872b1e6e82b49b0c6d88b8247d69fe6ed75c68d6fd041c15c4519"

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
