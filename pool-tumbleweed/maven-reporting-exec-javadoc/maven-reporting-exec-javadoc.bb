SUMMARY = "API documentation for maven-reporting-exec"
DESCRIPTION = "The API documentation of maven-reporting-exec."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "maven-reporting-exec-javadoc-1.6.0-1.11.noarch.rpm"
RPM_HASH = "2a70dfba5bedab01d42e187fc8311283377aaa60f09ef3354d4adf5c069c52cccf788b928ae7f56701fb303ccd7d608d049e6bb753248d65b3ad160966b3cf79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-exec-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
