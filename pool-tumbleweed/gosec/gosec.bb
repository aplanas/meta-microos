SUMMARY = "Golang security checker"
DESCRIPTION = "Inspects source code for security problems by scanning the go abstract syntax tree."
LICENSE = "Apache-2.0"

PV = "2.17.0"

RPM_NAME = "gosec-2.17.0-1.1.aarch64.rpm"
RPM_HASH = "7083ad6fffb82146ebd0cdb39ed8f461bbce959748523455baa44c68cbd030c77dea440b5dd84dbf1621790cca538d0b09b4015c5dc1349b2a85cd5ec0125bf5"

RPROVIDES:${PN} += "gosec"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
