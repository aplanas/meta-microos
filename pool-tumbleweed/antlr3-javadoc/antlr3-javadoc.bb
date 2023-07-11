SUMMARY = "API documentation for antlr3"
DESCRIPTION = "API documentation for antlr3."
LICENSE = "BSD-3-Clause"

PV = "3.5.3"

RPM_NAME = "antlr3-javadoc-3.5.3-2.4.noarch.rpm"
RPM_HASH = "7d5d42bc62c1a0a69ac392985f0368784609cfa49d3b27abe6e0da8e554cf566fd747d97af2e9ead806d5dd5f7ca34f4a8100035b2c01738e4628551a1a98384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr3-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
