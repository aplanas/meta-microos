SUMMARY = "API documentation for osgi-compendium"
DESCRIPTION = "This package provides API documentation for osgi-compendium."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-compendium-javadoc-7.0.0-2.5.noarch.rpm"
RPM_HASH = "20a6db1c49f53fbc478f8671b50652b004ace9252152e7d7636a09f6ff90d31ff073f438d4a8d14536566b7061812eaa71c41035060ceb75a32274ecaed7cda2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-compendium-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
