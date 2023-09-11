SUMMARY = "Transmitting and receiving frames of ARQ data (hamradio)"
DESCRIPTION = "Fast Light Automatic Repeat reQuest is a file transfer application that is based \
on the ARQ specification developed by Paul Schmidt, K9PS.  It is capable of \
transmitting and receiving frames of ARQ data via Fldigi. The interaction \
between Flarq and Fldigi requires no operator intervention."
LICENSE = "GPL-3.0-only"

PV = "4.2.00"

RPM_NAME = "flarq-4.2.00-1.1.aarch64.rpm"
RPM_HASH = "167fde027587e3241b72410efa15062650bada4811a39d7a6ae7e1fdc66e2a806697575c0bc521f1d47deac38bb1e8d53b1efbbb494533eefc2d7efd46d05da7"

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
