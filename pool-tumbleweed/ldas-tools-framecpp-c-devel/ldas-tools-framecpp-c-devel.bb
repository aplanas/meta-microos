SUMMARY = "Headers and source files for developing with ldas-tools-framecpp's in C"
DESCRIPTION = "This package provides the headers and sources needed for developing programs \
with ldas-tools-framecpp in C."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "ldas-tools-framecpp-c-devel-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "94796ddcea522531f4f89f5919746cf38dc40f7ebe0720da09810d6865b8727178378b531086bb8969e89624aa48402e9c3260f137cde49a739c4ab8e32b7408"

RPROVIDES:${PN} += "ldas-tools-framecpp-c-devel \
pkgconfig-framecppc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libframecppc3"

inherit rpm
