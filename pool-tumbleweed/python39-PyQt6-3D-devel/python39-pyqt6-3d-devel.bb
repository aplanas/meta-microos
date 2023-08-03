SUMMARY = "Devel files for python39-PyQt6-3D"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-3D"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-3D-devel-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "9b40c77820bd8ca486c25756efe51d0b505332ffaec9c2f2d9ef256c51c9cc42c996ad0a8613103e67a70cd9cb5e8b06a5e6bd86c0b77ecdee5a41ac395eb116"

RPROVIDES:${PN} += "python39-PyQt6-3D-devel"

RDEPENDS:${PN} += "python39-PyQt6-devel"

inherit rpm
