SUMMARY = "Javadoc for freemarker"
DESCRIPTION = "This package contains the API documentation for freemarker."
LICENSE = "Apache-2.0"

PV = "2.3.31"

RPM_NAME = "freemarker-javadoc-2.3.31-2.8.noarch.rpm"
RPM_HASH = "195d3c161eb4fed5f9f0213cedaf1d64432e25111c487150c0780dd161a88e717e49a11462b782b380159921622e82d05c7c3b33a49a259e812a8132702014bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freemarker-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
