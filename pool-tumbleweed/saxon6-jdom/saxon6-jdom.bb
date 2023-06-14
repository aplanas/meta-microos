SUMMARY = "JDOM support for saxon6"
DESCRIPTION = "JDOM support for saxon6."
LICENSE = "MPL-1.0"

PV = "6.5.5"

RPM_NAME = "saxon6-jdom-6.5.5-16.6.noarch.rpm"
RPM_HASH = "8e57481f55da5495ac2862d4f814b5191554e5976587279f42bb2c0e8f13fe01affedff548633c821e5af27a1ae02ecfcd119bff42283ffda32265bfc1ed5790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-saxon-saxon-jdom \
saxon-jdom \
saxon6-jdom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
jdom \
saxon6"

inherit rpm
