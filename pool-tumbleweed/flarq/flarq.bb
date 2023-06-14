SUMMARY = "Transmitting and receiving frames of ARQ data (hamradio)"
DESCRIPTION = "Fast Light Automatic Repeat reQuest is a file transfer application that is based \
on the ARQ specification developed by Paul Schmidt, K9PS.  It is capable of \
transmitting and receiving frames of ARQ data via Fldigi. The interaction \
between Flarq and Fldigi requires no operator intervention."
LICENSE = "GPL-3.0-only"

PV = "4.1.26"

RPM_NAME = "flarq-4.1.26-1.3.aarch64.rpm"
RPM_HASH = "9a913f456c9f978857e2c62283d3a61c9e709af47fe84f79ddeb9cf0f494eee54ee24abd2fdbb968d61c08c3fba16e8f8ff2b05e32ea7dca60802da477247cb3"

RPROVIDES:${PN} += "flarq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfltk-images.so.1.3 \
libfltk.so.1.3 \
libflxmlrpc.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
update-desktop-files"

inherit rpm
