SUMMARY = "Development files for libappmenu-gtk3-parser"
DESCRIPTION = "This package contains development-files for libappmenu-gtk3-parser."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk3-parser-devel-0.7.6-2.1.aarch64.rpm"
RPM_HASH = "911ada85d02447ec8813a86d58a27d0b22b173511a0f36a529cd094db60e572a53f592761b6b3e753955f2044c624ac0268b8a885ec79d41548ff307ec4840ee"

RPROVIDES:${PN} += "libappmenu-gtk3-parser-devel \
pkgconfig-appmenu-gtk3-parser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libappmenu-gtk-parser-devel \
libappmenu-gtk3-parser0 \
pkgconfig-gtk+-3.0"

inherit rpm
