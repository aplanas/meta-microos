SUMMARY = "Documentation for texlive-euro-ce"
DESCRIPTION = "This package includes the documentation for texlive-euro-ce"
LICENSE = "BSD-3-Clause"

PV = "2023.209.3.0bsvn25714"

RPM_NAME = "texlive-euro-ce-doc-2023.209.3.0bsvn25714-53.1.noarch.rpm"
RPM_HASH = "311c53dbcc85a6a0ffd406d93311f037f62fcaf3d160da9e7ea6a781f2c665f5f71398db1c342b148e9f55ef6b71329e37088c91be703e23ccab31f7002b60f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euro-ce-doc"

RDEPENDS:${PN} += ""

inherit rpm
