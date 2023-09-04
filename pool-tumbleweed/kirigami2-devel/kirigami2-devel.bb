SUMMARY = "Development package for kirigami"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kirigami2-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "1c18e7ccc8535913226f5970d720dd014955dc9db209c5faae3937e345ca6c05a0f07a415eacf75e1f2717de2d669f96a34c33b14e348ac0175242e6fd7597ff"

RPROVIDES:${PN} += "cmake-KF5Kirigami2 \
kirigami2-devel"

RDEPENDS:${PN} += "kirigami2 \
libKF5Kirigami2-5"

inherit rpm
