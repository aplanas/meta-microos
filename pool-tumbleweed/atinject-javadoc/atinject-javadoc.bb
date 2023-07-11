SUMMARY = "API documentation for atinject"
DESCRIPTION = "API documentation for atinject."
LICENSE = "Apache-2.0"

PV = "1+20160610git1f74ea7"

RPM_NAME = "atinject-javadoc-1+20160610git1f74ea7-2.7.noarch.rpm"
RPM_HASH = "841606a64a67adfecd9a529d89c99c5770c6812dc22aedcd96dc779241e3d992f46d6657c353e5d494c4adc9a16d8c1381d2bb927d32d3c0038983c5ae7c4110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atinject-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
