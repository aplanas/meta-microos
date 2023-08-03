SUMMARY = "Transmitting and receiving frames of ARQ data (hamradio)"
DESCRIPTION = "Fast Light Automatic Repeat reQuest is a file transfer application that is based \
on the ARQ specification developed by Paul Schmidt, K9PS.  It is capable of \
transmitting and receiving frames of ARQ data via Fldigi. The interaction \
between Flarq and Fldigi requires no operator intervention."
LICENSE = "GPL-3.0-only"

PV = "4.1.27"

RPM_NAME = "flarq-4.1.27-1.1.aarch64.rpm"
RPM_HASH = "d64001800e2e6bd6a8df22fd5ad9a62240764126002bd4a4b9cf2e053f98e4102d340b456b9ecd317ffa9fd9c4b37e49c7b1252c2c7a58ebfc60942cbbf1dfd2"

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
