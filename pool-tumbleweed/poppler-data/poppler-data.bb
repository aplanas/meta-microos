SUMMARY = "Encoding Files for use with libpoppler"
DESCRIPTION = "This package consists of encoding files for use with poppler. The \
encoding files are optional and poppler will automatically read them if \
they are present. When installed, the encoding files enables poppler \
to correctly render CJK and Cyrrilic properly."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only"

PV = "0.4.12"

RPM_NAME = "poppler-data-0.4.12-1.1.noarch.rpm"
RPM_HASH = "c1da22af324ece3bacc094bf074ff9138ba6b09f7bef45530c3a44664a1e2cf17d411466b6ef8942a78541c3cba513139d0a053285b38b702e507c41c4c9726f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poppler-data"
RDEPENDS:${PN} += ""

inherit rpm
