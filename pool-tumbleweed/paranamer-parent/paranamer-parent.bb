SUMMARY = "ParaNamer Parent POM"
DESCRIPTION = "This package contains the ParaNamer Parent POM."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-parent-2.8-2.11.noarch.rpm"
RPM_HASH = "a5cda3b31758836f9d1a51e9a8d6077df750ecd78d643c3c686d100d345e697defcc3be97b8522b51febae920cfebce73bf0b538d004079d07e3e90dbbb62c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-parent-pom- \
paranamer-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugins-maven-compiler-plugin \
mvn-org.apache.maven.plugins-maven-surefire-plugin"

inherit rpm
