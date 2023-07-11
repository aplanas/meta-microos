SUMMARY = "YASM development package"
DESCRIPTION = "This package includes everything needed to develop programs that use \
libyasm."
LICENSE = "Artistic-1.0 & BSD-2-Clause & BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "yasm-devel-1.3.0-7.4.aarch64.rpm"
RPM_HASH = "24feb446336ea6d67204c001a3bb9c138d8d6389a0ff9c53cd382735e7de7d4e25b2194f891059787134518c0821415a3ffd541b6c3e86a020ee8b17e15f5d22"

RPROVIDES:${PN} += "yasm-devel"

RDEPENDS:${PN} += "yasm"

inherit rpm
