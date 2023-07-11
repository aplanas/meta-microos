SUMMARY = "Devel files for python310-PyQt6-NetworkAuth"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-NetworkAuth"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-NetworkAuth-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "ce6f8a026bb6177f4311c86c221533fa0c5e841fb515404c12bb936900f6c6d5a1e7814321e192360bf57181b439af78a487fe0ee410d0c73240859f233fcade"

RPROVIDES:${PN} += "python310-PyQt6-NetworkAuth-devel"

RDEPENDS:${PN} += "python310-PyQt6-devel"

inherit rpm
