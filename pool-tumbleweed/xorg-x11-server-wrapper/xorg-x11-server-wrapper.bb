SUMMARY = "Xserver SUID Wrapper"
DESCRIPTION = "This package contains an SUID wrapper for the Xserver."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-wrapper-21.1.8-1.1.aarch64.rpm"
RPM_HASH = "ac48251cde323d729fad2de3fbf51191eae3ee19348355624880f5d4c4ab26b6067a975deac0c07b489a7798a847d852158962d5fb7df89698a237e2c1921ed0"

RPROVIDES:${PN} += "xorg-x11-server-wrapper"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
xorg-x11-server"

inherit rpm
