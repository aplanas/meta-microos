SUMMARY = "Javadoc for spec-version-maven-plugin"
DESCRIPTION = "This package contains javadoc for spec-version-maven-plugin."
LICENSE = "EPL-2.0 | GPL-2.0-with-classpath-exception"

PV = "2.1"

RPM_NAME = "spec-version-maven-plugin-javadoc-2.1-1.11.noarch.rpm"
RPM_HASH = "e5120d08cc72d084bf2d2084c526ff3248313dac180454899712d568796fede5afd6d354d39369a3fd0efef64426ab31a809b4db28fd24491509776f6305e6de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spec-version-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
