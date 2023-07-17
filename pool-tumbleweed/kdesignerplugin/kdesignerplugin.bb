SUMMARY = "Framework for integration of KDE frameworks widgets with Qt Designer"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kdesignerplugin-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "8666ec4b3b493f6fbf8209439a550011ea205d6b51d65e448cda06a71bb945b5794ef0aaa291f8095c2bf3e74e2b02ecbb20f8bcc56b4f5f8ae289d1239a0f8a"

RPROVIDES:${PN} += "kdesignerplugin"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
