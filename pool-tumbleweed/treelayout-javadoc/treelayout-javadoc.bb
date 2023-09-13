SUMMARY = "Javadoc for treelayout"
DESCRIPTION = "This package contains javadoc for treelayout."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-javadoc-1.0.3-4.1.noarch.rpm"
RPM_HASH = "12077a2c49a6589bf1150f8d0e9494cb7354bed9902c7576d266a0369a766c86258e61b6a488b1c4385d2c7747d8bf266b68ee9fe89cb2c4c647876b6298dd6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "treelayout-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
