SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libmount-devel-static-2.38.1-13.1.aarch64.rpm"
RPM_HASH = "1d9e0870446f8053c20def411fa3a3b2dff70598bbc526891aa145ac56956657f4af59065cf3ae09fa741f681303ffe271617789f39589706fb28126b3470c3c"

RPROVIDES:${PN} += "libmount-devel-static"

RDEPENDS:${PN} += "libmount-devel"

inherit rpm
