SUMMARY = "Annotations for use in compiling OSGi bundles"
DESCRIPTION = "Annotations for use in compiling OSGi bundles. This package is not normally \
needed at run-time."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-annotation-7.0.0-3.4.noarch.rpm"
RPM_HASH = "d936f93f87b3dac9586fb6f47ea30d93e0ce2e1cb7c145d1da01cb05c298d805e2ba5b122eb4a3a93f17c937c68a4099f0be76d08461586083f9851cb7e32e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.osgi:org.osgi.annotation) \
mvn(org.osgi:org.osgi.annotation:pom:) \
mvn(org.osgi:osgi.annotation) \
mvn(org.osgi:osgi.annotation:pom:) \
osgi(osgi.annotation) \
osgi-annotation"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
