SUMMARY = "Qt 6 HunspellInputMethod private library"
DESCRIPTION = "Internal library used by Qt for providing Hunspell support. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6HunspellInputMethod6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "bfb721ec2e8f7cf77c0871c3bec330f7000877ba6bab9410792873fa04ae9f2d7c86f2e49d4c9af6e098e823de1b0a4465036ea6adb9eb75f29fa77a9c3c1653"

RPROVIDES:${PN} += "libQt6HunspellInputMethod.so.6()(64bit) \
libQt6HunspellInputMethod.so.6(Qt_6)(64bit) \
libQt6HunspellInputMethod6 \
libQt6HunspellInputMethod6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6VirtualKeyboard.so.6()(64bit) \
libQt6VirtualKeyboard.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
