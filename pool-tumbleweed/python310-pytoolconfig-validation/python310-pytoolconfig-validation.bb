SUMMARY = "[validation] extra for python310-pytoolconfig"
DESCRIPTION = "Python Tool Configuration - [validation] extra"
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python310-pytoolconfig-validation-1.2.4-1.6.noarch.rpm"
RPM_HASH = "bebc2ded32e1342e0e1bd77ad6e49e12f313632928b374a7d63297e1fb2d39bf62da5c9be6308444fa8ffb26fc4e104c89e4c9f885c91c7c6a89a529c8d3ed41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pytoolconfig-validation"

RDEPENDS:${PN} += "python310-pydantic \
python310-pytoolconfig"

inherit rpm
