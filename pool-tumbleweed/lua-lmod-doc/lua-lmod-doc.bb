SUMMARY = "Documentation for Lmod"
DESCRIPTION = "Documentation (pdf) for the Lmod Environment Modules System."
LICENSE = "MIT"

PV = "8.7.17"

RPM_NAME = "lua-lmod-doc-8.7.17-2.1.noarch.rpm"
RPM_HASH = "25eab8c6c379460c7e31d90598b23ad8aee6e6847a9e329fe10f15a0887c3d98f0d86fe0f16c1adc905cb5576707bfa0226b374141a8b886698f5d5d82aaeb6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-lmod-doc"

RDEPENDS:${PN} += ""

inherit rpm
