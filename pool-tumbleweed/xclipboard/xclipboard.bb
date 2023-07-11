SUMMARY = "X clipboard client"
DESCRIPTION = "xclipboard is used to collect and display text selections that are \
sent to the CLIPBOARD by other clients.  It is typically used to save \
CLIPBOARD selections for later use.  It stores each CLIPBOARD \
selection as a separate string, each of which can be selected."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "xclipboard-1.1.4-1.5.aarch64.rpm"
RPM_HASH = "97a3f583c0b181457d22ee0900af18f9a5679a88460f9d81c3def3d83ba68d6c86b6e355c49f27d75ceb33814e524e0728f9fdf4ba5069780d57c0583a943aea"

RPROVIDES:${PN} += "xclipboard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libxkbfile.so.1"

inherit rpm
