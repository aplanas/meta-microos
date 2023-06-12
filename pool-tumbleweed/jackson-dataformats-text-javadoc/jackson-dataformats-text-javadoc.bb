SUMMARY = "Javadoc for jackson-dataformats-text"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-text."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformats-text-javadoc-2.13.3-1.7.noarch.rpm"
RPM_HASH = "8dbd0602226f156be2667d78eb5ddeb9070b029b773d3f1fdc5031858d03177a34052a75d71e279ff64dddeded4e1be0ffb15be0577b3281ebd4e58a3f242af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
