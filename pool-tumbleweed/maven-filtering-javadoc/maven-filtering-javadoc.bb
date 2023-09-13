SUMMARY = "Javadoc for maven-filtering"
DESCRIPTION = "This package contains the API documentation for maven-filtering."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "maven-filtering-javadoc-3.3.1-1.1.noarch.rpm"
RPM_HASH = "13f94c656b36ab5b90855b078fb36abef11613eec5c58cd8897ba9889699eb33244bddb99c34df5dbe202c593c662fdb13b42a66986bf61b44450000f96646ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-filtering-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
