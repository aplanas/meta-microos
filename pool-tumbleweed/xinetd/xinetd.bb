SUMMARY = "An 'inetd' with Expanded Functionality"
DESCRIPTION = "xinetd takes the abilities of inetd and appends additional \
functionality: \
- Access Control \
- Prevention of 'denial of access' attacks \
- Extensive logging abilities \
- Clear configuration file"
LICENSE = "xinetd"

PV = "2.3.15.4"

RPM_NAME = "xinetd-2.3.15.4-1.20.aarch64.rpm"
RPM_HASH = "42c4ab0baae22fe3a75a26e284c496e7b39be391d2c14fa46044c083d8efd120076ce53b024dc4dc2150899adc6e4120c93ab60625cc5f9ae69ece25048a1630"

RPROVIDES:${PN} += "config-xinetd \
inet-daemon \
xinetd"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libtirpc.so.3 \
libwrap.so.0 \
systemd"

inherit rpm
