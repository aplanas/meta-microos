SUMMARY = "Development package for kirigami"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kirigami2-devel-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "5989dc2056708c8d5851213407fba33536540c8e1471e2721779880be989674fd468d5ad76a0025e3d1c65a4b664e98ab593eea346c110671279a4782ba32586"

RPROVIDES:${PN} += "cmake-KF5Kirigami2 \
kirigami2-devel"

RDEPENDS:${PN} += "kirigami2 \
libKF5Kirigami2-5"

inherit rpm
