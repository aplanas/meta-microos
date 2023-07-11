SUMMARY = "Codegenerator"
DESCRIPTION = "This package contains a codegenerator for ongres-stringprep"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-codegenerator-1.1-1.11.noarch.rpm"
RPM_HASH = "9658d9b596be8cf15d145336324268057000429b32e58cb0fba282d8486e895c6a589ddd29798987b21fed6aed6a0fa325470f5cf10a12e837f6678340a15187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.stringprep-codegenerator \
mvn-com.ongres.stringprep-codegenerator-pom- \
ongres-stringprep-codegenerator"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.velocity-velocity"

inherit rpm
