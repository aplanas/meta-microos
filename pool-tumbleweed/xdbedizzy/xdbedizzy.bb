SUMMARY = "Demo of X11 Double Buffer Extension"
DESCRIPTION = "xdbedizzy is a demo of the X11 Double Buffer Extension (DBE) \
creating a double buffered spinning scene."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "xdbedizzy-1.1.0-9.27.aarch64.rpm"
RPM_HASH = "f74987e5c1a957d81fbfcb7c39ec505efc4ea18cb60b61ad6b40fbfde05c562a9fccebd8f0fbedafa83eccaf9ccf1ebcaf5cb272908c112144e708317b4a3f71"

RPROVIDES:${PN} += "xdbedizzy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
