SUMMARY = "Javadoc for modello"
DESCRIPTION = "API documentation for modello."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.0"

RPM_NAME = "modello-javadoc-2.0.0-3.1.noarch.rpm"
RPM_HASH = "b2e1d467f425be74a63a5b0fc9fdc4edbf76a850140f0aa3d59f304d9b28596f2820da0e3827a4a8eab0e2c469c7db9077811d34b9b416956adb2880e31ab5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
