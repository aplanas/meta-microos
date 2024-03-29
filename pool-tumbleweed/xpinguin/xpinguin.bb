SUMMARY = "The 'Logo' of Linux 2.0"
DESCRIPTION = "Based on xteddy -- really cute ;-)"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "xpinguin-1.0.2-1236.8.aarch64.rpm"
RPM_HASH = "4c0d3359269a851f41d3a7342d5d76ccefca64ede206c659b67b7822ce96a43e88b9409c881a5169dbfb0a5312c3f4ba43c32566e98cb0ae0f2ed052b18c05be"

RPROVIDES:${PN} += "xpinguin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXpm.so.4 \
libc.so.6"

inherit rpm
