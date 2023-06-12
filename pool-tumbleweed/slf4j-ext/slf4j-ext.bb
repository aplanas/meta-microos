SUMMARY = "SLF4J Extensions Module"
DESCRIPTION = "Extensions to the SLF4J API."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "slf4j-ext-1.7.36-4.1.noarch.rpm"
RPM_HASH = "d7352e5f122d20ac1c0074a81a79e2e38af8fa35a811f266203f05b0179e26d7324fbc5a58e8a3b9f905ced9c61b72b85f0e07c797f7fe12bc279124a72602f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.slf4j:slf4j-ext) \
mvn(org.slf4j:slf4j-ext:pom:) \
osgi(slf4j.ext) \
slf4j-ext"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.slf4j:slf4j-api)"

inherit rpm
