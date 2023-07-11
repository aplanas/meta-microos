SUMMARY = "Javadoc for maven-shared-utils"
DESCRIPTION = "API documentation for maven-shared-utils."
LICENSE = "Apache-2.0"

PV = "3.3.4"

RPM_NAME = "maven-shared-utils-javadoc-3.3.4-1.2.noarch.rpm"
RPM_HASH = "cbbfcb17f71de3be978bbed95f20015582e6f7e7bf0aa28f49594a8f25e1061b196ed3e67a5b68c0d7fc5dbd547d55495059a78f4253087cf7529029efaa8fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-utils-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
