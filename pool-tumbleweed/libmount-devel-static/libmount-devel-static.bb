SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libmount-devel-static-2.39-3.1.aarch64.rpm"
RPM_HASH = "7a0cc1f42587b97f8ab1261ed531501090d88a151171cde1676ee6be1292734e6d0996ceb7be5c7f3ebe405be31ef8083cd00631ad63b95fc74203f28a077b70"

RPROVIDES:${PN} += "libmount-devel-static"

RDEPENDS:${PN} += "libmount-devel"

inherit rpm
