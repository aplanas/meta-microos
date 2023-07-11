SUMMARY = "API documentation for jchardet"
DESCRIPTION = "API documentation for jchardet."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "jchardet-javadoc-1.1-2.7.noarch.rpm"
RPM_HASH = "5bee02d5f731390b22e73cdad853b82c86d23860003c3ff3af558e9c1546988989035f6d21b45d9a6eb4e0983c43be424add47417f98224245aba1d96282c87e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jchardet-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
