SUMMARY = "Javadoc for maven-plugin-bundle"
DESCRIPTION = "API documentation for maven-plugin-bundle."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-plugin-bundle-javadoc-3.5.1-4.11.noarch.rpm"
RPM_HASH = "cca0a5169fd2ae07dd29bc95da07b2d15844b0bfddceaf8349ef1c1b4c5c23598d5dbe9427d2a64290d49d661582cf688db475eead9b21ce96ff353067f69099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-bundle-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
