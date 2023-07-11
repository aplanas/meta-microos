SUMMARY = "Login manager extension for a Remmina kiosk mode"
DESCRIPTION = "This package installs a Remmina Kiosk mode to the list of the \
available sessions for all freedesktop compliant login managers."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-kiosk-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "b76f82dc6777c7db472b0a172d30a85ed186d49acca071d8893e454448d134e6af8a0763410bb8679662b46a7b25d8c5e91346410cb188b15a7cd13449c45993"

RPROVIDES:${PN} += "remmina-kiosk"

RDEPENDS:${PN} += "/usr/bin/sh \
remmina"

inherit rpm
