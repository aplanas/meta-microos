SUMMARY = "LibreOffice Writer Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Writer: \
 \
- MediaWiki Publisher"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-writer-extensions-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "ca2e20e3f5a87dd44b95ee648d1be9e99b9ee4adf91808d9fafdf6331ae2bf3c0ebfebfc8612719333d213f8d88686f8de508c1088440387227855448895b428"

RPROVIDES:${PN} += "libreoffice-writer-extensions"

RDEPENDS:${PN} += "jre-64 \
libreoffice \
libreoffice-writer"

inherit rpm
