SUMMARY = "Open Collaboration Service client library"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "attica-qt5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c948cf66064b154478db5c0859e0ca52819aba616f118d9c8d800c8fd3f118d4b644a3bee3b4c632164b37a252bd97cc33fbbc5e87cc6762591209c1f627461c"

RPROVIDES:${PN} += "attica-qt5 \
attica-qt5(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
