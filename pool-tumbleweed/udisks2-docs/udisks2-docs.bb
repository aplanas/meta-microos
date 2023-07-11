SUMMARY = "Developer documentation for udisks2"
DESCRIPTION = "This package contains developer documentation for udisks2."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "udisks2-docs-2.9.4-6.4.noarch.rpm"
RPM_HASH = "9a2223d3221b0083054c405e0f9ccab753602032ac877b74d51a90d896b15ecc12c814a0b9c0c4a619371eb443a92f56da3ff6fa0b876452a356e434dd21cb7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "udisks2-docs"

RDEPENDS:${PN} += ""

inherit rpm
