SUMMARY = "Transmitting and receiving frames of ARQ data (hamradio)"
DESCRIPTION = "Fast Light Automatic Repeat reQuest is a file transfer application that is based \
on the ARQ specification developed by Paul Schmidt, K9PS.  It is capable of \
transmitting and receiving frames of ARQ data via Fldigi. The interaction \
between Flarq and Fldigi requires no operator intervention."
LICENSE = "GPL-3.0-only"

PV = "4.1.26"

RPM_NAME = "flarq-4.1.26-1.4.aarch64.rpm"
RPM_HASH = "266e0b1d705171fb41295a63822295c0e7b6e1e37b9db30b19c2b080a74458ec162d02658f43d62125b9e1b15e510b378af4a0bc6dc4586842f5d5b9632b7232"

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
