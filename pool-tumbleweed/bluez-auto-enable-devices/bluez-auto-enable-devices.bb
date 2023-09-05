SUMMARY = "Configuration that automatically enables all bluetooth devices"
DESCRIPTION = "Contains configuration that automatically enables all bluetooth devices \
that are connected to the system if no other tool is handling them (e.g. \
desktop specific applets like blueman or GNOME or KDE applets)."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-auto-enable-devices-5.68-4.2.noarch.rpm"
RPM_HASH = "90ed4174ffc713d17c754dbe5f627a0cbd0f3fdd93a21cd70712f6ddbbe9c16c382a5c5b45388131992327617a6f40dea72721e95e449db297c45430c0246c12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-auto-enable-devices \
config-bluez-auto-enable-devices"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
