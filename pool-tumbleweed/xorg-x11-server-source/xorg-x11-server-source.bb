SUMMARY = "Source code of X.Org server"
DESCRIPTION = "This package contains patched sources of X.Org Server."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-source-21.1.8-1.3.aarch64.rpm"
RPM_HASH = "aacfba76641e83685e2de430e38d7c6fab4f26386047eba223d05d42340ae6194e91cafc50ecfce3ef2394d3638b5b5b327d0c6926c72e341b47d668e103ffcd"

RPROVIDES:${PN} += "xorg-x11-server-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
