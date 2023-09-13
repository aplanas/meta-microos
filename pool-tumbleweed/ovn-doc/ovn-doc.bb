SUMMARY = "Open Virtual Network Documentation"
DESCRIPTION = "Contains additional documentation for OVN."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-doc-23.03.0-15.1.noarch.rpm"
RPM_HASH = "9df0b3821632444faec8ab9be413f0d4cf6e1dad7e52bd841a540e05ae2a121922c7878ebe66afd7bf445220e4b001c33a097b50a83d1d2c6dccbaa6ad0179f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ovn-doc"

RDEPENDS:${PN} += ""

inherit rpm
