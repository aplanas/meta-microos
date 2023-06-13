SUMMARY = "Javadocs for jansi"
DESCRIPTION = "This package contains the API documentation for jansi."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "jansi-javadoc-2.4.0-2.1.noarch.rpm"
RPM_HASH = "33ec8f69934e220b637f2f00c4f0b63dd1a898f165554539a75e37edaf5bfaf30148168f0786b26fadc75449251344fb1b63d612c6551b57820e26f06d086cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jansi-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
