SUMMARY = "MIME email parser for KDE PIM - development files"
DESCRIPTION = "This package contains development headers needed to use MIME message parsing \
in KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-mime-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2da5030e3be9d974661d3305de0e43bd96af9890b9786cecac6a7e0f046ef670dc702eae1ca95b6fa9197c4960dbe19201fe19345ac17a349ac36c09442f0dc9"

RPROVIDES:${PN} += "akonadi-mime-devel \
cmake-KF5AkonadiMime \
cmake-KPim5AkonadiMime"

RDEPENDS:${PN} += "cmake-KPim5Akonadi \
libKPim5AkonadiMime5"

inherit rpm
