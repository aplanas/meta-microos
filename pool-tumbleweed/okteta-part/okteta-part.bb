SUMMARY = "Hex Editor KParts plugin"
DESCRIPTION = "Hex editing component for KParts"
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.12"

RPM_NAME = "okteta-part-0.26.12-1.1.aarch64.rpm"
RPM_HASH = "f7e81c288b8d1f6fdb1b722aadda6fdca08a17b5f661d881304cecbd62fe6c04f20f8198cd4894e1d43f1e27eb62cf1d0d8dec591b20501070cead0c831e267b"

RPROVIDES:${PN} += "okteta-part"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5Parts.so.5 \
libKF5XmlGui.so.5 \
libKasten4Controllers.so.0 \
libKasten4Core.so.0 \
libKasten4Gui.so.0 \
libKasten4Okteta2Controllers.so.0 \
libKasten4Okteta2Core.so.0 \
libKasten4Okteta2Gui.so.0 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
