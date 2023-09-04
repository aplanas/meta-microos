SUMMARY = "Javadoc for jackson-dataformats-text"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-text."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformats-text-javadoc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "d392734ec0a3601459e4e9a9ed04bf837b211a199d219e27d13b18b749c253c254c4c406318a44ad15b2b7a1821300b8818eda7ed96f2f718760251ad3bd5a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
