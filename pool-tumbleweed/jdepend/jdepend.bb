SUMMARY = "Java Design Quality Metrics"
DESCRIPTION = "JDepend traverses a set of Java class and source file directories and \
generates design quality metrics for each Java package. JDepend allows \
you to automatically measure the quality of a design in terms of its \
extensibility, reusability, and maintainability to effectively manage \
and control package dependencies."
LICENSE = "MIT"

PV = "2.10"

RPM_NAME = "jdepend-2.10-3.3.noarch.rpm"
RPM_HASH = "2a1680e27fd7562bf1c5fd1eb3d5d3b31c8fefd2ccb62f9eacdb014036ce6364f5d465897afca526fcc9177897868fd3f1f4b37288ae07f53c272b14a8b5f743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdepend \
mvn(jdepend:jdepend) \
mvn(jdepend:jdepend:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
