SUMMARY = "XML Im-/Exporter"
DESCRIPTION = "XML Im-/Exporter is a low level library to assist you in the straight \
forward process of importing and exporting XML from and to your Java \
classes. All of this is designed having performance and simplicity in \
mind."
LICENSE = "LGPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "xml-im-exporter-1.1-29.7.noarch.rpm"
RPM_HASH = "023e35058cfd5991e194be5ced261cf940b734c2e822fea00d95f9fe5d4679524d93417d71970d9121c561c70c38328fe3fc93d90035aefe96e9b15e6926c7e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-de.zeigermann.xml-xml-im-exporter \
mvn-de.zeigermann.xml-xml-im-exporter-pom- \
xml-im-exporter"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
