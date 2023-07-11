SUMMARY = "Qt5 Speech examples"
DESCRIPTION = "Examples for the libqt5-qtspeech module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde1"

RPM_NAME = "libqt5-qtspeech-examples-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "a653b4ebae0d1bc5ca0fdc7a0bca4fc3204f299fa6f2cf6ce325b0d4f8c32bf37ec9ee1f6e5e1576e6db85946c4fb42d95398a16a1ea9640eb689af2cff10ac3"

RPROVIDES:${PN} += "libqt5-qtspeech-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
