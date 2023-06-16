SUMMARY = "Source code of X.Org server"
DESCRIPTION = "This package contains patched sources of X.Org Server."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-source-21.1.8-1.1.aarch64.rpm"
RPM_HASH = "6241cadf23d182658b0938ad05eeb187e011617693c6d06d6677cdcd76bbcafabe96af92bc431162492d8ca4cfa28c9455635220b090a3ee27dcfa6c63a3ce64"

RPROVIDES:${PN} += "xorg-x11-server-source"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
