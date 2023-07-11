SUMMARY = "GObject-based library for the Telepathy D-Bus API -- Developer documentation"
DESCRIPTION = "The telepathy-glib library is a GObject-based C binding for the \
Telepathy D-Bus API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.24.2"

RPM_NAME = "telepathy-glib-doc-0.24.2-1.11.aarch64.rpm"
RPM_HASH = "006a1628099dd71a27de2321988a7c4f093d554c128c60f4dfeac22ad561c6a82b173434476291a4b71d11887f955e31a3958bdec00657826e5e16ed31463b2a"

RPROVIDES:${PN} += "telepathy-glib-doc"

RDEPENDS:${PN} += "libtelepathy-glib0"

inherit rpm
