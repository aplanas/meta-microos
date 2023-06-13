SUMMARY = "API documentation for maven-shared-jarsigner"
DESCRIPTION = "This package provides API documentation for maven-shared-jarsigner."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-shared-jarsigner-javadoc-3.0.0-2.21.noarch.rpm"
RPM_HASH = "1fc721ac5b7670fb994a15629065ee6c6a2b37a715a50a144972674b48f8ad4d53d15f73eab173fea3884770930040321137ab2dcf1ed762cb6454875ef522a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-jarsigner-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
