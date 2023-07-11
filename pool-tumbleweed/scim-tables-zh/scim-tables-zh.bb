SUMMARY = "SCIM Chinese Data Files"
DESCRIPTION = "This package includes SCIM table IM data files in Chinese. \
 \
The data files come from UNICON and XCIN."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-zh-0.5.14.1-2.32.aarch64.rpm"
RPM_HASH = "f195f4898a2f3aac0418a186a1faa44d7b8984a89fbeddb262dbda5e7f2763ef61b7f3b1e2a2e34c4b185f8f5f6f610421d7c69cf5fdba4be61dc1025da04f19"

RPROVIDES:${PN} += "locale-scim-tables-zh \
scim-tables-zh"

RDEPENDS:${PN} += "scim-tables"

inherit rpm
