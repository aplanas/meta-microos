SUMMARY = "API documentation for osgi-compendium"
DESCRIPTION = "This package provides API documentation for osgi-compendium."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "osgi-compendium-javadoc-7.0.0-2.4.noarch.rpm"
RPM_HASH = "898b6ce84814ae3b77120b3301b8f2e49abcb5d29412222398406ca614f779db26029e1acf9d852915c442025ab96bd698830adb20c55400b91e1a2f9fa6662c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-compendium-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
