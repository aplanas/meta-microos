SUMMARY = "SCIM Japanese Data Files"
DESCRIPTION = "This package includes the SCIM table IM data files in Japanese. \
 \
The data files come from UNICON."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-ja-0.5.14.1-2.32.aarch64.rpm"
RPM_HASH = "8585724a30fbd4ccec0ab3706b98f0c508482972203cb1f983c4ec75c8f3e276cbb698bd688a459d5d1d86c5ecf54b2256f88041c22a5886dabc4a883df6fa85"

RPROVIDES:${PN} += "locale-scim-tables-ja \
scim-tables-ja"

RDEPENDS:${PN} += "scim-tables"

inherit rpm
