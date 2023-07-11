SUMMARY = "Javadoc for jdom2"
DESCRIPTION = "This package contains javadoc for jdom2."
LICENSE = "Saxpath"

PV = "2.0.6.1"

RPM_NAME = "jdom2-javadoc-2.0.6.1-1.7.noarch.rpm"
RPM_HASH = "b6c232bdbbb88deaf1fd1b9d752dbb9c53359b1eb363a7d88360b4c61559c17c29860e358497ebb3bd8be280ef40633e4d3f6de23a506b190fa9e52f0707542e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom2-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
