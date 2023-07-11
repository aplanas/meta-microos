SUMMARY = "Additional Import and Export Filters for LibreOffice"
DESCRIPTION = "This package includes some additional import and export filters for \
LibreOffice: \
- AportisDoc (Palm) \
- Pocket Excel \
- Pocket Word \
- DocBook \
- XHTML"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-filters-optional-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "e4eb0ec98e87236b6ac24ebb11fe82750ca8eec4907f34f44ef1ace50cb93904ad8d8b07694609c5c13cea5c06c89cd464c508233263c2e5963f63ce59227753"

RPROVIDES:${PN} += "libreoffice-filters-optional"

RDEPENDS:${PN} += "libreoffice-calc \
libreoffice-draw \
libreoffice-impress \
libreoffice-math \
libreoffice-writer"

inherit rpm
