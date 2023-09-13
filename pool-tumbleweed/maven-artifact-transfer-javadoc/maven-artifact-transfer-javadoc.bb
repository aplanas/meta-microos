SUMMARY = "API documentation for maven-artifact-transfer"
DESCRIPTION = "This package provides API documentation for maven-artifact-transfer."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "maven-artifact-transfer-javadoc-0.13.1-2.1.noarch.rpm"
RPM_HASH = "9bac4f0ca7982e55d62afa028df89e2a37416a66df63f0c2539947551bf9f56b11bd30bdf89838d91d0848186bd74296905ee021f1bf5bd5468860e4a2c0cc4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-transfer-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
