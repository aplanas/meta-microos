SUMMARY = "Tools for a wireless LAN"
DESCRIPTION = "This package contains the wireless tools, used to manipulate the \
wireless extensions. The wireless extension is an interface that allows \
you to set wireless LAN specific parameters and get specific stats."
LICENSE = "GPL-2.0-only"

PV = "30.pre9"

RPM_NAME = "wireless-tools-30.pre9-40.8.aarch64.rpm"
RPM_HASH = "08fe60762daedbf2d6eb439359b976cc5c3b27a140cfebbdeacd60240f962897662330e5b7a0e33923e324f77843de769ae2e48522990cf28f53d28c2dc2a3ba"

RPROVIDES:${PN} += "wireless-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libiw \
libiw.so.30 \
libm.so.6"

inherit rpm
