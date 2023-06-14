SUMMARY = "LibreOffice Writer Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Writer: \
 \
- MediaWiki Publisher"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-writer-extensions-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "1291d351f772a6d52367e66b595efd26446ee349565d18d4086c3be13a9a35ab19006eece8788e830626e4fea8d086b2ed3dfa71d21d8f05d1fbfe8b00b0fa52"

RPROVIDES:${PN} += "libreoffice-writer-extensions"

RDEPENDS:${PN} += "jre-64 \
libreoffice \
libreoffice-writer"

inherit rpm
