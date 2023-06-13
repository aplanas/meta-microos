SUMMARY = "SCIM Japanese Data Files"
DESCRIPTION = "This package includes the SCIM table IM data files in Japanese. \
 \
The data files come from UNICON."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-ja-0.5.14.1-2.31.aarch64.rpm"
RPM_HASH = "ee9b231ef87b0a1af8cb898e0c7e021c4d7effb041e2b57d56206650cf4ad53e4e4c7118081f3ec19fd0474a993262954b9388abc2a5bfb6f7ebba86c6de8f02"

RPROVIDES:${PN} += "locale(scim-tables:ja) \
scim-tables-ja \
scim-tables-ja(aarch-64)"

RDEPENDS:${PN} += "scim-tables"

inherit rpm
