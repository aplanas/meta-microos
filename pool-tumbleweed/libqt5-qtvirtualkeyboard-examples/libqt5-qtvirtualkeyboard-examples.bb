SUMMARY = "Qt5 virtualkeyboard examples"
DESCRIPTION = "Examples for libqt5-qtvirtualkeyboard module."
LICENSE = "GPL-3.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "38016cd8ffc8b9eeb39ceaec6924f8100b90af45e7725b9ea69fdaf3b6db39f10eb01b66013614dc67f59f609550dd38ace6238236ef58a3aead9a5590cff038"

RPROVIDES:${PN} += "libqt5-qtvirtualkeyboard-examples"

RDEPENDS:${PN} += ""

inherit rpm
