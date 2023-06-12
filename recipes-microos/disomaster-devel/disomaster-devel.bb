SUMMARY = "Development tools for deepin movie"
DESCRIPTION = "The disomaster-devel package contains the header files and developer docs for \
disomaster movie."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.8"

RPM_NAME = "disomaster-devel-5.0.8-1.3.aarch64.rpm"
RPM_HASH = "67adfd6c492e314003a6998e431daa03c5d9410d4d73c59abd0ba3c40b1915d0a3e1f3295dfb3e0de670ab8ace6e661a3420f20c46a0fb9e4d6bf62eae2192e0"

RPROVIDES:${PN} += "disomaster-devel \
disomaster-devel(aarch-64) \
pkgconfig(disomaster)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdisomaster1"

inherit rpm
