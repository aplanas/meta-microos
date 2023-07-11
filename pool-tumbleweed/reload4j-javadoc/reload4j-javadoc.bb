SUMMARY = "Javadoc for reload4j"
DESCRIPTION = "This package contains the API documentation for reload4j."
LICENSE = "Apache-2.0"

PV = "1.2.20"

RPM_NAME = "reload4j-javadoc-1.2.20-1.6.noarch.rpm"
RPM_HASH = "58a9421adbf886d157c513edbe20437c39496f713a15f31ab0e55461c74f1b68b0262560fa5a77e318de1f3b59319ddfda37b37fcd991eb7ff8b2f11d5c80796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j12-javadoc \
reload4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
