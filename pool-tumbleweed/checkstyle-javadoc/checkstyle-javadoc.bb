SUMMARY = "Javadoc for checkstyle"
DESCRIPTION = "API documentation for checkstyle."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0"

RPM_NAME = "checkstyle-javadoc-8.0-4.10.noarch.rpm"
RPM_HASH = "9b570e0c36bbf70e99a20ba066871c1258f2cd9841f03ef34da5cceb152898f03fb37f34c5aabd485b065907f4aaf197e3e29988476f3e4033e017a91bd22c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "checkstyle-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
