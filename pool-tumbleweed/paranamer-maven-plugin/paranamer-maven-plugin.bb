SUMMARY = "ParaNamer Maven plugin"
DESCRIPTION = "This package contains the ParaNamer Maven plugin."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-maven-plugin-2.8-2.10.noarch.rpm"
RPM_HASH = "dbb3d43f08159ad95886dd583df20a155974c302849760f82d4a150fe10049f3e38a86a82918e59c63286d162252a25f30339d2f52514793cae550d641701b64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer-maven-plugin \
mvn-com.thoughtworks.paranamer-paranamer-maven-plugin-pom- \
paranamer-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.paranamer-paranamer-generator \
mvn-org.apache.maven-maven-plugin-api"

inherit rpm
