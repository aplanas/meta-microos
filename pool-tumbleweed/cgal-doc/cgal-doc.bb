SUMMARY = "Documentation CGAL algorithms"
DESCRIPTION = "This package provides the documentation for CGAL algorithms."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.6"

RPM_NAME = "cgal-doc-5.6-1.1.noarch.rpm"
RPM_HASH = "907c0b4598fa9eff371914497b8092cf0d10da1617d482ba7c40703456226ec1ea711c98f50593e6a4f8a9d3d5a2dff286988f04cb2c36d4af6dace6ec5bdf5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cgal-doc"

RDEPENDS:${PN} += ""

inherit rpm
