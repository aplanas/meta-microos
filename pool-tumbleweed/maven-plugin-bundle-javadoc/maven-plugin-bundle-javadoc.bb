SUMMARY = "Javadoc for maven-plugin-bundle"
DESCRIPTION = "API documentation for maven-plugin-bundle."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-plugin-bundle-javadoc-3.5.1-4.10.noarch.rpm"
RPM_HASH = "49ddb8860959624dc28f7a83a347755de3458582e31579039653c9b76beece22acaa1e4220ad11012602908040b719ae350c0ce80804ba62a9462d5b8d9fa78f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-bundle-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
