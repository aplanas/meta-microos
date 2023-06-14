SUMMARY = "Qt 5 Designer Library"
DESCRIPTION = "The Qt 5 Designer library."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libQt5Designer5-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "b9f605731ec4091d63cf5a8b049300f75647734420dd282217db188d991382ca09f95eeb70fb3253ea095034f76c48d263a6c7516e3eb972df31bb23e751b669"

RPROVIDES:${PN} += "libQt5Designer.so.5 \
libQt5Designer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQt5Xml.so.5 \
libQt5Xml5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
