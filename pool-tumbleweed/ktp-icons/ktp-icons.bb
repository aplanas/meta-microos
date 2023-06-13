SUMMARY = "Icons for KDE Telepathy"
DESCRIPTION = "icons for all the KDE Telepathy packages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-icons-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3ac67e031b1674fac0ed2ce384d941ef635d04751c0b0cdaec9870c67f5c9fc21a37298b6875caed6841872f2b36e9a04d516a71782cb78e128aa2d184397d3d"

RPROVIDES:${PN} += "ktp-icons \
ktp-icons(aarch-64) \
ktp-icons5"

RDEPENDS:${PN} += ""

inherit rpm
