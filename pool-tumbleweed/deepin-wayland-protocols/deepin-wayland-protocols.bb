SUMMARY = "Deepin Wayland Protocols"
DESCRIPTION = "This project should be installing only the xml files of the non-standard wayland \
protocols we use in Deepin."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "deepin-wayland-protocols-1.6.0-1.3.aarch64.rpm"
RPM_HASH = "164193ee7d908fee9e9b9ca934d6658f077c64e72ee1286f5103d977b2869e5802f96319bda4f73bc54328480f9dd75159545ca91227931246977284237f8dea"

RPROVIDES:${PN} += "cmake-DeepinWaylandProtocols \
deepin-wayland-protocols"

RDEPENDS:${PN} += ""

inherit rpm
