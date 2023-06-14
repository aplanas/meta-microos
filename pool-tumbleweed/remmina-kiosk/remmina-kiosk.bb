SUMMARY = "Login manager extension for a Remmina kiosk mode"
DESCRIPTION = "This package installs a Remmina Kiosk mode to the list of the \
available sessions for all freedesktop compliant login managers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-kiosk-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "b6719ac574776bbb494185dd821a2a45dce92f3af8670ace06f6b1c7315683af570a0773b6aee750fb6ae724676dce73f08c9f36153f340311c1e6f0dedaf2e7"

RPROVIDES:${PN} += "remmina-kiosk"

RDEPENDS:${PN} += "/bin/sh \
remmina"

inherit rpm
