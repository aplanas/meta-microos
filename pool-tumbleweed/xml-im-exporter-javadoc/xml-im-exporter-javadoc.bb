SUMMARY = "XML Im-/Exporter"
DESCRIPTION = "XML Im-/Exporter is a low level library to assist you in the straight \
forward process of importing and exporting XML from and to your Java \
classes. All of this is designed having performance and simplicity in \
mind."
LICENSE = "LGPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "xml-im-exporter-javadoc-1.1-29.7.noarch.rpm"
RPM_HASH = "b4617065d1658c35f6f6aca222f01f81f906d6740f79224ed5488ece690a172ba02a0007c223c1ad83937891e34d3f0931a1622b7ce53fc53f765aa1a79bab22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-im-exporter-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
