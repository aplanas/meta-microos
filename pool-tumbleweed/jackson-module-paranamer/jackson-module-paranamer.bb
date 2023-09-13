SUMMARY = "Jackson module that uses Paranamer to introspect names of constructor params"
DESCRIPTION = "Module that uses Paranamer library to auto-detect names of Creator \
(constructor, static factory method, annotated with @JsonCreator) methods."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-paranamer-2.15.2-2.1.noarch.rpm"
RPM_HASH = "6c7a54540392e84fbd02791ec29febbd9394033314d09c0d1caf6b190591b1c104a0f55e7f86646634826d969af156ca8a6a7769060601fb0c870a7048a2423a"
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
