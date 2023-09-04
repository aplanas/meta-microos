SUMMARY = "Additional Import and Export Filters for LibreOffice"
DESCRIPTION = "This package includes some additional import and export filters for \
LibreOffice: \
- AportisDoc (Palm) \
- Pocket Excel \
- Pocket Word \
- DocBook \
- XHTML"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-filters-optional-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "066fdf4841c47db0c213fb001f9362d1d23ece451baaa9be0582c3011cc0969b5dbdc11beb7eb0ea68bd4f12a1aa3974a3473359dbd2a836298191728ff59e2f"

RPROVIDES:${PN} += "libreoffice-filters-optional"

RDEPENDS:${PN} += "libreoffice-calc \
libreoffice-draw \
libreoffice-impress \
libreoffice-math \
libreoffice-writer"

inherit rpm
