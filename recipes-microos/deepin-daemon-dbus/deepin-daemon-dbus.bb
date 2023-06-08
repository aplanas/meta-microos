SUMMARY = "Deepin daemon DBus profiles"
DESCRIPTION = "This package provides dbus profiles for deepin-daemon. These profiles are not \
adopted by security team. If you need the dbus feature, you should install \
them manually or use deepin-dbus-install package."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "deepin-daemon-dbus-5.14.45-2.3.noarch.rpm"
RPM_HASH = "f07f68576334624cd201b3c07b8e34a5fce7d09e7b8ea461291634c9794d0ff3c68abc038be39701407fe2e2625113e2b37f2fd1a16dcf45d71a8af2a15a1d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-daemon-dbus"
RDEPENDS:${PN} += "deepin-daemon"

inherit rpm
