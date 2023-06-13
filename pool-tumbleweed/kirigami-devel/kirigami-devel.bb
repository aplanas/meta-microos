SUMMARY = "Development package for kirigami"
DESCRIPTION = "QtQuick plugins to build user interfaces based on the KDE UX guidelines. \
Development files."
LICENSE = "LGPL-2.1+"

PV = "1.1.0"

RPM_NAME = "kirigami-devel-1.1.0-1.32.aarch64.rpm"
RPM_HASH = "737108057cd78a2fe490c0ce28cb50678b1ddd9440cbc3b0edfcec28bc9dcea704a74e6ffef8228c72396b9a4a6fba153ada05a1d83510357f23c59c3f02b520"

RPROVIDES:${PN} += "cmake(KF5Kirigami) \
kirigami-devel \
kirigami-devel(aarch-64)"

RDEPENDS:${PN} += "kirigami"

inherit rpm
