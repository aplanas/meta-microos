SUMMARY = "SCIM Korean Data Files"
DESCRIPTION = "This package includes SCIM table IM data files in Korean. \
 \
The data files come from UNICON."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-ko-0.5.14.1-2.31.aarch64.rpm"
RPM_HASH = "765c577ea911355fead2555a4b623ebf670fd838786a1eaf7c7a243308b6d6d88cee01937b3f6e4c1324de156f2f2bdbf9044af6d7d261dd0466be89e4e3e5f6"

RPROVIDES:${PN} += "locale(scim-tables:ko) \
scim-tables-ko \
scim-tables-ko(aarch-64)"

RDEPENDS:${PN} += "scim-tables"

inherit rpm
