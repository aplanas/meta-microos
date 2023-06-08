SUMMARY = "A glossy Matrix collaboration client - desktop"
DESCRIPTION = "A glossy Matrix collaboration client - desktop"
LICENSE = "Apache-2.0"

PV = "1.11.26"

RPM_NAME = "element-desktop-1.11.26-1.1.noarch.rpm"
RPM_HASH = "9fb9370e7df9c539ca0dac638238228babeb92d16e1b4d3330f73dee43125833f557d9d62c21aa51214be133f07d87422c5d1bb851ed1aaa5405998e87c3ef2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(io.element.Element.desktop) config(element-desktop) element-desktop mimehandler(x-scheme-handler/element)"
RDEPENDS:${PN} += "/bin/sh element-web nodejs-electron"

inherit rpm
