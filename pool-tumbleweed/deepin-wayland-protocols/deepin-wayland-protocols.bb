SUMMARY = "Deepin Wayland Protocols"
DESCRIPTION = "This project should be installing only the xml files of the non-standard wayland \
protocols we use in Deepin."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "deepin-wayland-protocols-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "1786aa599af3984400cd36f7d8ce1d09c74e35d7bae59266623e9717e7c70bbf06b16ee6775e05d0fc54858b758534e8d4dd7b3565bc8137451eee805c99b338"

RPROVIDES:${PN} += "cmake-DeepinWaylandProtocols \
deepin-wayland-protocols"

RDEPENDS:${PN} += ""

inherit rpm
