SUMMARY = "Javadoc for maven-shared-io"
DESCRIPTION = "API documentation for maven-shared-io."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-io-javadoc-3.0.0-2.13.noarch.rpm"
RPM_HASH = "900e2512afdb101365d9b458950e12c35f643a472e48ee3df1437922375770b0f9045ad8a8b31f808b6150c77d654931e8b638dc5ac9762eb6a948c38b75ca9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-io-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
