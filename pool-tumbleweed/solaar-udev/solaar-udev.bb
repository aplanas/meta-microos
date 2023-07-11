SUMMARY = "Udev rules for accessing Logitech Unifying Receiver"
DESCRIPTION = "Rules that users are able to access Logitech Unifying Receiver."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.9"

RPM_NAME = "solaar-udev-1.1.9-1.2.noarch.rpm"
RPM_HASH = "50c6c103581325f05cd313d81c1ff08582d58ec79ec98913b01b86afba2cf83c2244dd7778aef4b6bb5886b82e4dfd31c066bf25cf498e0959019cb5344e3a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solaar-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
udev"

inherit rpm
