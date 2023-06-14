SUMMARY = "Configuration that automatically enables all bluetooth devices"
DESCRIPTION = "Contains configuration that automatically enables all bluetooth devices \
that are connected to the system if no other tool is handling them (e.g. \
desktop specific applets like blueman or GNOME or KDE applets)."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-auto-enable-devices-5.66-1.6.noarch.rpm"
RPM_HASH = "dd0dcafea5b262425ee0c305bf9b551b6022bfbc0e0ca9c52e5aae761ee47f65d40182f3008143828eb4e91353bc6f6c4081999af383c4940df98f93c7f5e49b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bluez-auto-enable-devices \
config-bluez-auto-enable-devices"

RDEPENDS:${PN} += "/bin/sh \
systemd"

inherit rpm
