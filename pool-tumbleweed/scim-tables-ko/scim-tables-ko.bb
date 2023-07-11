SUMMARY = "SCIM Korean Data Files"
DESCRIPTION = "This package includes SCIM table IM data files in Korean. \
 \
The data files come from UNICON."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-ko-0.5.14.1-2.32.aarch64.rpm"
RPM_HASH = "517130a770895dd902de86a78f8fdc7b329f91d36163018b2f7ed7a6e08776405dc9ea612c9109786a1fa0212fa0291bf95580302ff802577176e0c6c4da7153"

RPROVIDES:${PN} += "locale-scim-tables-ko \
scim-tables-ko"

RDEPENDS:${PN} += "scim-tables"

inherit rpm
