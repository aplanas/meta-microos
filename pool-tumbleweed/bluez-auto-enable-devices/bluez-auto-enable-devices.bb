SUMMARY = "Configuration that automatically enables all bluetooth devices"
DESCRIPTION = "Contains configuration that automatically enables all bluetooth devices \
that are connected to the system if no other tool is handling them (e.g. \
desktop specific applets like blueman or GNOME or KDE applets)."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "bluez-auto-enable-devices-5.69-1.1.noarch.rpm"
RPM_HASH = "434cf0149e080aaf346a2aa4a8ec75c035d4ad657e7c9b1b357b2afdd61818516369a77eb5acf52f855d35b5a506a7df1c4e2baad5d3665e6477bf52a1492df3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-auto-enable-devices \
config-bluez-auto-enable-devices"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
