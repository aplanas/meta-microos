SUMMARY = "Tool to view/extract information about Nintendo Switch Archives"
DESCRIPTION = "hactool is a tool to view information about, decrypt, and extract \
common file formats for the Nintendo Switch, especially Nintendo \
Content Archives."
LICENSE = "ISC"

PV = "1.4.0"

RPM_NAME = "hactool-1.4.0-1.12.aarch64.rpm"
RPM_HASH = "61eb0b98548c3b67e9d0fb5aa149d674370b6f72afe1ac69d557d7bd415d0303c9ac60e02c04f839fb8ccd8454ae3f9b4ccc43a93aa55a9dcce7fc4c058d11b0"

RPROVIDES:${PN} += "hactool"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
