SUMMARY = "Development tools for Deepin Anything"
DESCRIPTION = "The udisks2-qt5-devel package contains the header files and developer \
docs for udisks2-qt5."
LICENSE = "LGPL-3.0+"

PV = "5.0.6"

RPM_NAME = "udisks2-qt5-devel-5.0.6-1.8.aarch64.rpm"
RPM_HASH = "a490da01cc271e116458fa3df683c5fe0ac085dde10a7ef765d4de4cee297af1635f52eb6896b56d5aefcae919ce83a9adc3698a4ff2f15197bfa94fd031cbdf"

RPROVIDES:${PN} += "pkgconfig(udisks2-qt5) \
udisks2-qt5-devel \
udisks2-qt5-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libudisks2-qt5-0"

inherit rpm
