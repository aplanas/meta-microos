SUMMARY = "Qt5 Speech examples"
DESCRIPTION = "Examples for the libqt5-qtspeech module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtspeech-examples-5.15.9+kde1-1.2.aarch64.rpm"
RPM_HASH = "14791e7adc6b9a0ad0cf680ae90e334c2a8d714d40021ccaaa03c4bc7d4aa6fe3a1fede00662b550f19dc7a0be9369c411cca43e679cec6511294d88899bb4aa"

RPROVIDES:${PN} += "libqt5-qtspeech-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
