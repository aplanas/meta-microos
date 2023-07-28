SUMMARY = "LibreOffice Writer Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Writer: \
 \
- MediaWiki Publisher"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-writer-extensions-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "7ae4467dd5225faac56cfee7edcfa89c2e8a198896e0ece5972883f4e5524825bdbe2b04205e7c07f8cbb11682a9ae71f3a3cd1c5e584c92b673d1adc20c8c87"

RPROVIDES:${PN} += "libreoffice-writer-extensions"

RDEPENDS:${PN} += "jre-64 \
libreoffice \
libreoffice-writer"

inherit rpm
