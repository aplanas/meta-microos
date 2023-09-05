SUMMARY = "Javadoc for jdom"
DESCRIPTION = "Javadoc for jdom."
LICENSE = "Saxpath"

PV = "1.1.3"

RPM_NAME = "jdom-javadoc-1.1.3-40.1.noarch.rpm"
RPM_HASH = "2612126c4afc7affd2cfc23f1540c4bde3de5702078bee39b8fd28d05488c5a65119824dbfa9318fa8a9e40d084d4fb25c6cffeb771c7e367659bcd1c13d863a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
