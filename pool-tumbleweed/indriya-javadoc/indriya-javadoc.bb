SUMMARY = "Javadoc for the Units of Measurement Libraries"
DESCRIPTION = "Javadoc for the Units of Measurement Libraries"
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "indriya-javadoc-1.3-4.1.noarch.rpm"
RPM_HASH = "e12b4befb15a30769c56fc33e0fcc166a54ef0b4271ce7c9ebe7a1ba730fa02c6915ba4b3e1f66c7ca0f8cf037a6d6217afe5c2920faf9ff097892f077ea56c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indriya-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
