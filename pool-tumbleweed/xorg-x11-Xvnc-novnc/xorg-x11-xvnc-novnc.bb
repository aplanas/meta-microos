SUMMARY = "NoVNC service for Xvnc"
DESCRIPTION = "A service that starts noVNC linked to Xvnc server."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "xorg-x11-Xvnc-novnc-1.13.1-3.3.noarch.rpm"
RPM_HASH = "72e68a5ad3c8f4ee57670aa73fade06ba7bd78d723d51b3e0186f13490fe45f5c183cc6b11a86a8055fc40af4766ffb899704be72406357404b01898f2234491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-Xvnc-novnc"

RDEPENDS:${PN} += "/usr/bin/sh \
novnc \
python3-websockify \
systemd \
xorg-x11-Xvnc"

inherit rpm
