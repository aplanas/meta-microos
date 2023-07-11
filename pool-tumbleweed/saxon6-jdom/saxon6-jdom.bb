SUMMARY = "JDOM support for saxon6"
DESCRIPTION = "JDOM support for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-jdom-6.5.5-16.7.noarch.rpm"
RPM_HASH = "7d71e10c166def37b8f43e0304f8626fbba80ef969ed23dd06ecd3c89ca209dc1acf72b4b812ba8de2ecef9b4380b45081019170255d305ac7e7406dffdfe081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-saxon-saxon-jdom \
saxon-jdom \
saxon6-jdom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jdom \
saxon6"

inherit rpm
