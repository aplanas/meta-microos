SUMMARY = "Tool to view/extract information about Nintendo Switch Archives"
DESCRIPTION = "hactool is a tool to view information about, decrypt, and extract \
common file formats for the Nintendo Switch, especially Nintendo \
Content Archives."
LICENSE = "ISC"

PV = "1.4.0"

RPM_NAME = "hactool-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "5f51ec497b7595e45687d4d82c4969ce16a2557d6721b0e96209d72badbbfe3964194f9e3c4fd026c9da02ccd4ff19168043b0f1149e224352bfeccf70895551"

RPROVIDES:${PN} += "hactool"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
