SUMMARY = "API Guardian Java annotation"
DESCRIPTION = "API Guardian indicates the status of an API element and therefore its \
level of stability as well.  It is used to annotate public types, \
methods, constructors, and fields within a framework or application in \
order to publish their API status and level of stability and to \
indicate how they are intended to be used by consumers of the API."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "apiguardian-1.0.0-2.7.noarch.rpm"
RPM_HASH = "865093a210af2a3097dc2d6c46f63f547b3bd67fcd53c73b2b0b3ec4613a1cf16230bb9e95f77baae2b44f0ae8408c9348ce835406ce849016ca7e8b02fd4b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apiguardian \
mvn-org.apiguardian-apiguardian-api \
mvn-org.apiguardian-apiguardian-api-pom- \
osgi-org.apiguardian"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
