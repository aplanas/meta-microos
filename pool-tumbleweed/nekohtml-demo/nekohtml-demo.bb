SUMMARY = "Demo for nekohtml"
DESCRIPTION = "Demonstrations and samples for nekohtml."
LICENSE = "Apache-2.0"

PV = "1.9.22.noko2"

RPM_NAME = "nekohtml-demo-1.9.22.noko2-1.4.noarch.rpm"
RPM_HASH = "4adecb0b55472ac4fc71239f9c4cd65dd5993d144ed96a66861e535087f85618f39368451628aa9b5ff140d2fb1c02e4cca8a13d731ae37f002526310a779944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-net.sourceforge.nekohtml-nekohtml-samples \
nekohtml-demo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
nekohtml"

inherit rpm
