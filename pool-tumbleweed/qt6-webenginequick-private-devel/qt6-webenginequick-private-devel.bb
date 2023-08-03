SUMMARY = "Non-ABI stable API for the Qt 6 WebEngineQuick library"
DESCRIPTION = "This package provides private headers of libQt6WebEngineQuick that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webenginequick-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "05aaf9f0278a607784f3a442963d7233b0ecafe2fc2096527e42bdc1c7ceee9a8a016048122c94af412d7a78bb5a58808ac5aedb44d423639cb6ea83bd6d660a"

RPROVIDES:${PN} += "qt6-webenginequick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6WebEngineQuick"

inherit rpm
