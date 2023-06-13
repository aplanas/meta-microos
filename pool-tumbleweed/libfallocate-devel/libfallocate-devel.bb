SUMMARY = "Header and devel files for libfallocate"
DESCRIPTION = "This package contains the header file and the .so library to link \
against for apps that want to use libfallocate."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfallocate-devel-0.1.1-17.15.aarch64.rpm"
RPM_HASH = "176f686a669c9221157738e736ab851d030d9e0c05028742cc3708d4d8089f7b640e2a18661e11529cee839eea6e7dca0781a380c794dea158b690cf89482e30"

RPROVIDES:${PN} += "libfallocate-devel \
libfallocate-devel(aarch-64)"

RDEPENDS:${PN} += "libfallocate0"

inherit rpm
