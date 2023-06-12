SUMMARY = "Javadoc for maven-shared-utils"
DESCRIPTION = "API documentation for maven-shared-utils."
LICENSE = "Apache-2.0"

PV = "3.3.4"

RPM_NAME = "maven-shared-utils-javadoc-3.3.4-1.1.noarch.rpm"
RPM_HASH = "afbb360b6a328c4f30e5b479d36475bc58065481412df7bd7ccc610efa224af8ded62ddc1ac7e46bb9a26281423d8b8e30f0cb7ff5f94a7305009044655a7bfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-utils-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
