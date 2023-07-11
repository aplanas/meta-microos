SUMMARY = "Javadoc for pentaho-libxml"
DESCRIPTION = "Javadoc for pentaho-libxml."
LICENSE = "LGPL-2.0-only"

PV = "1.1.3"

RPM_NAME = "pentaho-libxml-javadoc-1.1.3-6.7.noarch.rpm"
RPM_HASH = "ddfe747f45b74271276150d79774cf7cb2fc431c2f082b794c71b4f2e4d27fc1ddab8a375ff85f620e10df160fe349f24f7784a8a6591097e91a600bc95ef68d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pentaho-libxml-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
