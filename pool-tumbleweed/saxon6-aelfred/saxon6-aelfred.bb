SUMMARY = "Java XML parser"
DESCRIPTION = "A slightly improved version of the AElfred Java XML parser from \
Microstar."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-aelfred-6.5.5-16.7.noarch.rpm"
RPM_HASH = "dc0bb257fd505196a6b64d8ddb7b8783f53be03ab2721e30069a9858cf6451df3ab5b55bd8caed62f793148d6ef867dc75a15034544cfc76ed229de1c300ba2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-saxon-saxon-aelfred \
saxon-aelfred \
saxon6-aelfred"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xml-commons-apis"

inherit rpm
