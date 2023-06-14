SUMMARY = "The X Athena Widget Set"
DESCRIPTION = "The X Window System Athena widget set implements simple user \
interfaces based upon the X Toolkit Intrinsics (Xt) library."
LICENSE = "MIT"

PV = "1.0.15"

RPM_NAME = "libXaw7-1.0.15-1.3.aarch64.rpm"
RPM_HASH = "eeb72197fb8bc7503658146d5b1a19aa2958e19d86fef34303f5a8f19ad5810c0129e2f7f2b54c44bbc418ef9026869c4dd0ef275925f38a16d9d4354fb9ac12"

RPROVIDES:${PN} += "libXaw.so.7 \
libXaw7 \
libXaw7.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
