SUMMARY = "API documentation for Multi-Schema Validator"
DESCRIPTION = "API documentation for Multi-Schema Validator."
LICENSE = "Apache-1.1 & BSD-3-Clause & Apache-2.0 & SUSE-Public-Domain"

PV = "2013.6.1"

RPM_NAME = "msv-javadoc-2013.6.1-3.11.noarch.rpm"
RPM_HASH = "bfeb734cd89bfaa9763b788fa932140dae4c529b255d00ae49769b8e20179a99a6fecd7c2068e04227c2d5ef12ad49d3c57eb71e4323ca2274fd90f5ecaa4878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
