SUMMARY = "Javadoc for the Units of Measurement Libraries"
DESCRIPTION = "This package contains documentation for the Units of Measurement \
Libraries (JSR 363)."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-javadoc-1.2-1.19.noarch.rpm"
RPM_HASH = "11ca5688530ea3a01ac04f5866d0b4c322934e12dcb7d9419ab334031352943389d3b67d71fe5a444e232b1d59edc5520c421ab7e017c4b3ae028b9d745482dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uom-lib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
