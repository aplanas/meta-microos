SUMMARY = "Additional Import and Export Filters for LibreOffice"
DESCRIPTION = "This package includes some additional import and export filters for \
LibreOffice: \
- AportisDoc (Palm) \
- Pocket Excel \
- Pocket Word \
- DocBook \
- XHTML"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-filters-optional-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "c8f72779a0817af83cf4028db8e5b089c342887743c1afc237ee0d4d6425627ee9eb9faf7b7ce73d6208002ceafc573dc30537cf4a6a49f0ab275cf2cee4b44e"

RPROVIDES:${PN} += "application() \
application(libreoffice-xsltfilter.desktop) \
libreoffice-filters-optional \
libreoffice-filters-optional(aarch-64) \
mimehandler(application/vnd.oasis.opendocument.graphics-flat-xml) \
mimehandler(application/vnd.oasis.opendocument.presentation-flat-xml) \
mimehandler(application/vnd.oasis.opendocument.spreadsheet-flat-xml) \
mimehandler(application/vnd.oasis.opendocument.text-flat-xml)"

RDEPENDS:${PN} += "libreoffice-calc \
libreoffice-draw \
libreoffice-impress \
libreoffice-math \
libreoffice-writer"

inherit rpm
