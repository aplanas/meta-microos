SUMMARY = "Javadoc for bean-validation-api"
DESCRIPTION = "This package contains the API documentation for bean-validation-api."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "bean-validation-api-javadoc-2.0.1-1.18.noarch.rpm"
RPM_HASH = "cb038bc256465638ffe800affa4f609157531f760c4c2a9dedf0a70a9358d9128add06804057daf6617e451afa8b84eaa48836480382ca15c04d4bcb7ab117c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bean-validation-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
