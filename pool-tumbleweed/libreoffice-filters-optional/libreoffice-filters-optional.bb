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

RPM_NAME = "libreoffice-filters-optional-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "f5777a59d512542cec6aa3f5354e9ea86b9657bbaa4e872ff4f7c2239e1b410ec8e2762a78bd1338bd9d1a6e02e46f53bd111d1e39084ea89dac59d7c6bdf5ba"

RPROVIDES:${PN} += "libreoffice-filters-optional"

RDEPENDS:${PN} += "libreoffice-calc \
libreoffice-draw \
libreoffice-impress \
libreoffice-math \
libreoffice-writer"

inherit rpm
