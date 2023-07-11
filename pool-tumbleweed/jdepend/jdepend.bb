SUMMARY = "Java Design Quality Metrics"
DESCRIPTION = "JDepend traverses a set of Java class and source file directories and \
generates design quality metrics for each Java package. JDepend allows \
you to automatically measure the quality of a design in terms of its \
extensibility, reusability, and maintainability to effectively manage \
and control package dependencies."
LICENSE = "MIT"

PV = "2.10"

RPM_NAME = "jdepend-2.10-3.4.noarch.rpm"
RPM_HASH = "7f6ef8fe44a47bb03faab26ad200bb87847a7882dc61d9d91f103626ce935bf58710eb5106d69ad54ce9d3859fa0fdd2fc51a06b658ff5ca8e878e05a29cb553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdepend \
mvn-jdepend-jdepend \
mvn-jdepend-jdepend-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
