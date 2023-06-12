SUMMARY = "Javadoc for avalon-logkit"
DESCRIPTION = "API documentation for avalon-logkit."
LICENSE = "Apache-2.0"

PV = "2.1"

RPM_NAME = "avalon-logkit-javadoc-2.1-24.6.noarch.rpm"
RPM_HASH = "af9a5b115008c4caf6ab69169e64e8480461e359a364398ff7bef2f522202df1ef4bc930bf4d4e2af0eec058fd56521524d759621cbc2b022c8cbacf0513b950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-logkit-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
