SUMMARY = "Xserver SUID Wrapper"
DESCRIPTION = "This package contains an SUID wrapper for the Xserver."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-wrapper-21.1.8-1.3.aarch64.rpm"
RPM_HASH = "05a2d6dc284943398b38a52b2f3022941d3d5add19cc3a95ac5e6e18e0180106b934d4ddb639845f7ed9684a72196844cb7fa04536d786efc6eb840ffa5eed71"

RPROVIDES:${PN} += "xorg-x11-server-wrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
xorg-x11-server"

inherit rpm
