SUMMARY = "LibreOffice Writer Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Writer: \
 \
- MediaWiki Publisher"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-writer-extensions-7.6.1.1-1.1.aarch64.rpm"
RPM_HASH = "f36951f6d4f5a134c6e6cef8176a9a05d23519226420da37818d5aa75be6327ad79e226ea69c55f33608de5b31b6f25ede06015605383c60a368ab1fd5fcba70"

RPROVIDES:${PN} += "libreoffice-writer-extensions"

RDEPENDS:${PN} += "jre \
libreoffice \
libreoffice-writer"

inherit rpm
