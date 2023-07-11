SUMMARY = "Utility to print X-Video extension adaptor information"
DESCRIPTION = "xvinfo prints out the capabilities of any video adaptors associated \
with the display that are accessible through the X-Video extension."
LICENSE = "X11"

PV = "1.1.5"

RPM_NAME = "xvinfo-1.1.5-1.3.aarch64.rpm"
RPM_HASH = "ad6da2c268976f1a8b03e545062d313ccc6881d72c96b2ebbdb894b4b4b6aa8321588f06730531db2cb0ba6d4ae2e11b660f77fa1c96c6581b96f8cf0f5bf380"

RPROVIDES:${PN} += "xvinfo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXv.so.1 \
libc.so.6"

inherit rpm
