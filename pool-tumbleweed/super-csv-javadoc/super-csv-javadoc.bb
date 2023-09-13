SUMMARY = "Javadoc for super-csv"
DESCRIPTION = "This package contains javadoc for super-csv."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "super-csv-javadoc-2.4.0-5.1.noarch.rpm"
RPM_HASH = "938b04e04e404c992432b75c50062bb9b3b4162075858b8abb1bedb70f11f610a4b0ce9f203ac837e9d47aa9d8d0639da9a88a927949caa092f900344eaa186e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "super-csv-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
