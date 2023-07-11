SUMMARY = "A NapiProjekt client"
DESCRIPTION = "QNapi is unofficial clone of NapiProjekt program (http://napiprojekt.pl) \
written using Qt5. It's focused to be functional on GNU/Linux and other \
Unix-like systems, for which NapiProjekt is not available."
LICENSE = "GPL-2.0-or-later & BSD-2-Clause & BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "qnapi-0.2.3-5.27.aarch64.rpm"
RPM_HASH = "4e4e827bcbc3e4260bba0fd4ebf74e7297b396cd139424ba21e222b77a7bedf15942c9d60e352749046662bb3b21bf10bc537f19c54b5ebd89726736882cdc9b"

RPROVIDES:${PN} += "qnapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libmaia.so.1 \
libmediainfo.so.0 \
libstdc++.so.6 \
p7zip-full"

inherit rpm
