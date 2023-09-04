SUMMARY = "Jackson module that uses Paranamer to introspect names of constructor params"
DESCRIPTION = "Module that uses Paranamer library to auto-detect names of Creator \
(constructor, static factory method, annotated with @JsonCreator) methods."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-module-paranamer-2.15.2-1.1.noarch.rpm"
RPM_HASH = "ace83968b384049a545ec19048b29eb932c283d76438bb1240e1df033ae89a9e8713f8049266d5a90d1e1e50ae3277febb9783c9e6766986dee0a53254a82a4d"
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
