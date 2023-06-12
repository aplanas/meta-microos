SUMMARY = "API documentation for maven-clean-plugin"
DESCRIPTION = "This package provides API documentation for maven-clean-plugin."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-clean-plugin-javadoc-3.1.0-4.10.noarch.rpm"
RPM_HASH = "8e3d011ddfa0fd4f7415eeb584978b4b4ce89d00f7f755c2cc8f7efc75c28c112095a7e7b570e13f5680a069a1b45f9bcc68fc1751995dc2d1413f7b4b68bbe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-clean-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
