SUMMARY = "Javadoc for the Units of Measurement Libraries"
DESCRIPTION = "This package contains documentation for the Units of Measurement \
Libraries (JSR 363)."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "uom-lib-javadoc-1.2-2.1.noarch.rpm"
RPM_HASH = "47daae3d119497cd868aee319570154c96d138389029155dbbaf8400b216a2ee9200ab5cd1221ac4e6214d81aac76705f2722776044692db91532a82ec481be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uom-lib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
