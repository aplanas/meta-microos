SUMMARY = "SCIM Chinese Data Files"
DESCRIPTION = "This package includes SCIM table IM data files in Chinese. \
 \
The data files come from UNICON and XCIN."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-zh-0.5.14.1-2.31.aarch64.rpm"
RPM_HASH = "d1c939d4ff056442c813bff3fda1e765e6c21091b90d8768566127c4a6992e1a73a42d42ac3435d6b65461e638541dc584f99f66699cb210d67f8108aaf8eefe"

RPROVIDES:${PN} += "locale(scim-tables:zh) \
scim-tables-zh \
scim-tables-zh(aarch-64)"

RDEPENDS:${PN} += "scim-tables"

inherit rpm
