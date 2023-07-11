SUMMARY = "Javadoc for plexus-cipher"
DESCRIPTION = "API documentation for plexus-cipher."
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-cipher-javadoc-2.0-2.8.noarch.rpm"
RPM_HASH = "56ea5f2953bc974e7560a4892675f237b290addceb50347b28f8cdb869b4a1ed16c8889f8416dff84583190e3dcd777612efaafca65f9be28d28af4aea0ee20b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-cipher-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
