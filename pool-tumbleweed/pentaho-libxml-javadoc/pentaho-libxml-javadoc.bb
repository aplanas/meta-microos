SUMMARY = "Javadoc for pentaho-libxml"
DESCRIPTION = "Javadoc for pentaho-libxml."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "pentaho-libxml-javadoc-1.1.6-1.1.noarch.rpm"
RPM_HASH = "6af5ce3f3439eefc79f24214874ec89892abd6af3ce5e1c5ff0c0493e882f7fd95870ec215ca1bef4517f0e904dc382845cfb2bd3e097eecdc28fd78faa92511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-libxml-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
