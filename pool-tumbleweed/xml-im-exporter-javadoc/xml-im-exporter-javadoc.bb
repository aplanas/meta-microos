SUMMARY = "XML Im-/Exporter"
DESCRIPTION = "XML Im-/Exporter is a low level library to assist you in the straight \
forward process of importing and exporting XML from and to your Java \
classes. All of this is designed having performance and simplicity in \
mind."
LICENSE = "LGPL-2.0-or-later"

PV = "1.1"

RPM_NAME = "xml-im-exporter-javadoc-1.1-29.6.noarch.rpm"
RPM_HASH = "9195613c4dd4bf0223e71e973a9a0d0b6d833261da669354beb35bf5ef56b1a943086db49672b290b18a35ccf7dc3d72295e6e5fb6c468ac397b1b91482d0ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-im-exporter-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
