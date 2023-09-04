SUMMARY = "Configuration that automatically enables all bluetooth devices"
DESCRIPTION = "Contains configuration that automatically enables all bluetooth devices \
that are connected to the system if no other tool is handling them (e.g. \
desktop specific applets like blueman or GNOME or KDE applets)."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-auto-enable-devices-5.68-4.1.noarch.rpm"
RPM_HASH = "cd2f3fcc37eb974d02c503dfee38a18b85c5ef80e8758ff4bb7d725f00ccffdeb809d4a5ca479addc4b9122bc66ee9cd6caa70bb8820337670c06cab6be4e7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-auto-enable-devices \
config-bluez-auto-enable-devices"

RDEPENDS:${PN} += "/usr/bin/sh \
systemd"

inherit rpm
