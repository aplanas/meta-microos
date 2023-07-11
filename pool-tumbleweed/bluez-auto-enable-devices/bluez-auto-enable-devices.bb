SUMMARY = "Configuration that automatically enables all bluetooth devices"
DESCRIPTION = "Contains configuration that automatically enables all bluetooth devices \
that are connected to the system if no other tool is handling them (e.g. \
desktop specific applets like blueman or GNOME or KDE applets)."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-auto-enable-devices-5.66-1.8.noarch.rpm"
RPM_HASH = "e7fa3a75a6182749f3d4b9c3ee28d74ea4dfeb8e488d1446f9447def2a43d9093141e23d64c1eeb9d2d1bff3584afc506d4d5a6f3e00ba156ec0533f5fdaca39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-auto-enable-devices \
config-bluez-auto-enable-devices"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
