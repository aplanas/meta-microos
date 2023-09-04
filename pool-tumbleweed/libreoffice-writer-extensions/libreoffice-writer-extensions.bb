SUMMARY = "LibreOffice Writer Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Writer: \
 \
- MediaWiki Publisher"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-writer-extensions-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "2c521490a5cc666d1808ad50757dff9c29773e0600b684ba8ebfad3575ec1549c77b4e79f568adf8a558fc0d95fd4bb52d69968d2e7d22769776d80c33d35da4"

RPROVIDES:${PN} += "libreoffice-writer-extensions"

RDEPENDS:${PN} += "jre \
libreoffice \
libreoffice-writer"

inherit rpm
