SUMMARY = "API documentation for stax2-api"
DESCRIPTION = "This package contains the API documentation for stax2-api."
LICENSE = "BSD-2-Clause"

PV = "4.2.1"

RPM_NAME = "stax2-api-javadoc-4.2.1-2.1.noarch.rpm"
RPM_HASH = "39823cee634d69c3565cecf85db3d727d383837c3064c0ba6a98bf941ead1725d96755259a23b950a8ca3fac8d9ecebec1dcc175c7048f6501fd091f5a643647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stax2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
