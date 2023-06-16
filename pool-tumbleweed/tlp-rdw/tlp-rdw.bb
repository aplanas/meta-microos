SUMMARY = "TLP Radio Device Wizard"
DESCRIPTION = "TLP implements advanced power management for Linux. \
TLP is a pure command line tool with automated background tasks. \
It does not contain a GUI. \
 \
Switch radios upon network connect/disconnect and dock/undock."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.5.0"

RPM_NAME = "tlp-rdw-1.5.0-1.3.noarch.rpm"
RPM_HASH = "d58ec0dcb3bef322acfae4b58bc0e526079afc9bdbf0f2601d11a1d1289cda1e8d9f7df8c393a238155ae6ac7fcf836f3ce0ff2666dfbbe9d44498c71d60f028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tlp-rdw"

RDEPENDS:${PN} += "/usr/bin/sh \
NetworkManager \
systemd \
tlp"

inherit rpm
