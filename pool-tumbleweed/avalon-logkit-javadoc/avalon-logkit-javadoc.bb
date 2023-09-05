SUMMARY = "Javadoc for avalon-logkit"
DESCRIPTION = "API documentation for avalon-logkit."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "avalon-logkit-javadoc-2.1-25.1.noarch.rpm"
RPM_HASH = "c46ac4a63071aae5708ed96bc74172fcf9f5a8af8bd605a977c39bf0f058330a9947c05864e5bafd2a935502ee8a6ef9fe4bade7021340aca8eeb4a948a9e210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-logkit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
