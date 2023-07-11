SUMMARY = "Documentation for OpenStack log library"
DESCRIPTION = "Documentation for the ovsdbap library."
LICENSE = "Apache-2.0"

PV = "2.3.0"

RPM_NAME = "python-ovsdbapp-doc-2.3.0-1.1.noarch.rpm"
RPM_HASH = "b84f266065e411e9d792b1f2d8ab571c8f3dafa9836bd15755de222a422dd03512b4b8a96a13862b961d1b619387e6645a505c39f64627f8cbac39fa5a468de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ovsdbapp-doc"

RDEPENDS:${PN} += ""

inherit rpm
