SUMMARY = "Javadoc for freemarker"
DESCRIPTION = "This package contains the API documentation for freemarker."
LICENSE = "Apache-2.0"

PV = "2.3.31"

RPM_NAME = "freemarker-javadoc-2.3.31-3.1.noarch.rpm"
RPM_HASH = "4a6883e758cc05ce3253c5d6969240b0d8db0aee25ef3913ea2c25b3c60c7a6fd15cf943c7fab6aa26e489b79132a11ab3e35e127aa7227afff3f259e347762d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freemarker-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
