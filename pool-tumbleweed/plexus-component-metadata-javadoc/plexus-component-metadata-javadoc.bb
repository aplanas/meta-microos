SUMMARY = "API documentation for plexus-component-metadata"
DESCRIPTION = "API documentation for plexus-component-metadata."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-component-metadata-javadoc-2.1.1-4.1.noarch.rpm"
RPM_HASH = "31bf1ceff50f44acf1437b2ee393f57e26875ff01ae818831e10461029d8deb7fdc96dbdfc9291ae4d7d4105bd75f2f1dab1e5583001ef5168f6df5272013602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-component-metadata-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
