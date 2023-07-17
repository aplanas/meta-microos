SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libmount-devel-static-2.39-2.1.aarch64.rpm"
RPM_HASH = "8bbc4902e6805ca5f6b54824c48b4f717ad185cbb1e2b1773c062a8c2b3c213aa8229ec004af038fef41a26618e7b0a23fcce69967a286726fc1563dcb206526"

RPROVIDES:${PN} += "libmount-devel-static"

RDEPENDS:${PN} += "libmount-devel"

inherit rpm
