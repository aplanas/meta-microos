SUMMARY = "Additional Import and Export Filters for LibreOffice"
DESCRIPTION = "This package includes some additional import and export filters for \
LibreOffice: \
- AportisDoc (Palm) \
- Pocket Excel \
- Pocket Word \
- DocBook \
- XHTML"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-filters-optional-7.6.1.1-1.1.aarch64.rpm"
RPM_HASH = "20aa2ce096d945b2f729876eba2600ff466478f116a990920db917658721fe7d9273dcb6ffc51413c4e4aaff2d6351981d19cd8cc081ec93d9bbca516098edb3"

RPROVIDES:${PN} += "libreoffice-filters-optional"

RDEPENDS:${PN} += "libreoffice-calc \
libreoffice-draw \
libreoffice-impress \
libreoffice-math \
libreoffice-writer"

inherit rpm
