SUMMARY = "Jackson module that uses Paranamer to introspect names of constructor params"
DESCRIPTION = "Module that uses Paranamer library to auto-detect names of Creator \
(constructor, static factory method, annotated with @JsonCreator) methods."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-module-paranamer-2.13.3-1.8.noarch.rpm"
RPM_HASH = "a37d21ecba9982eac121fd650164cf93595ae27c3e427c6f10b1066cbdc8f013920b184909143350fd96804ae27295da0c2b6f5e36d570d2c1615250a511418e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-module-paranamer \
mvn-com.fasterxml.jackson.module-jackson-module-paranamer \
mvn-com.fasterxml.jackson.module-jackson-module-paranamer-pom- \
osgi-com.fasterxml.jackson.module.jackson-module-paranamer"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.thoughtworks.paranamer-paranamer"

inherit rpm
