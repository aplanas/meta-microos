SUMMARY = "Non-ABI stable API for the Qt 6 tools libraries"
DESCRIPTION = "This package provides private headers of qt6-tools that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-tools-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e84cf3b503b382b84defd55c6c8f516bbd3deceb5f3bbac520d02219d2b79bc0e29ef6b2665de5a6f0bfce57a91d4a7be060fefa8f837a4dbc78d41c47681a95"

RPROVIDES:${PN} += "qt6-tools-private-devel"

RDEPENDS:${PN} += ""

inherit rpm
