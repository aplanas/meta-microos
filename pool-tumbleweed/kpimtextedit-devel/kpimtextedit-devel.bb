SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kpimtextedit-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "3197af9a15e443c808023faa5197b61e6d1d42e19578feaf1aafb05da1c135910d85a3c298d259204761df6296b5f83b5929080542e9111dd67fa1ec0d06503f"

RPROVIDES:${PN} += "cmake-KF5PimTextEdit \
cmake-KPim5TextEdit \
kpimtextedit-devel"

RDEPENDS:${PN} += "cmake-KF5SyntaxHighlighting \
cmake-KF5TextEditTextToSpeech \
cmake-KF5TextWidgets \
ld-linux-aarch64.so.1 \
libKPim5TextEdit.so.5 \
libKPim5TextEdit5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
