SUMMARY = "JUL to SLF4J bridge"
DESCRIPTION = "JUL to SLF4J bridge."
LICENSE = "Apache-2.0 & MIT"

PV = "1.7.36"

RPM_NAME = "jul-to-slf4j-1.7.36-4.2.noarch.rpm"
RPM_HASH = "3f4266aeecccd5904a2b9a06dad7d493d930b0fad2515fad4bbc761b40d125d3287bba5a0765e53cddfcca0addec48487c30f57914929d162eea2b1d46f06eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jul-to-slf4j \
mvn-org.slf4j-jul-to-slf4j \
mvn-org.slf4j-jul-to-slf4j-pom- \
osgi-jul.to.slf4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
