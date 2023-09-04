SUMMARY = "Documentation for python-pyliblo"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python310-pyliblo-doc-0.10.0-3.1.aarch64.rpm"
RPM_HASH = "6170e7d8c4ef886adb7f0521f0c986e2d1867392934bb79fde6fc5881d26e81fdb8eaebd135a178d4b91c6d9e9a427cbd9f31d9f79e14e8475e4fb2b3002b37d"

RPROVIDES:${PN} += "python310-pyliblo-doc"

RDEPENDS:${PN} += "python310-pyliblo"

inherit rpm
