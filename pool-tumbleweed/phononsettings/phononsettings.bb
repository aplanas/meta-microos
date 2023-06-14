SUMMARY = "Settings Tool for Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "4.11.1"

RPM_NAME = "phononsettings-4.11.1-3.9.aarch64.rpm"
RPM_HASH = "5650b2c6b1c8ba3d62999777e95e67bc7c3d79103dc8ef4b8d766362590e782e8e092ad991ca634363ad4e7e3ff684696ea79ed748bf39bc072fd4bfcf7b2c70"

RPROVIDES:${PN} += "phononsettings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
