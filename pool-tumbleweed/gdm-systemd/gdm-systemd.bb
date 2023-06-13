SUMMARY = "Systemd gdm.service file"
DESCRIPTION = "GDM's systemd service file. \
By default openSUSE uses xdm which enables the DM based on sysconfig. \
This package is only needed if the system administrator wishes to use \
'systemctl' instead of openSUSE's default 'update-alternatives' method."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-systemd-44.1-1.1.noarch.rpm"
RPM_HASH = "1ae0f503da2049da11c2a1da2e084864dabd3c430c6bf0ba2fb793ff03d434239726f2881556bf6f68e1c4543ec641687dc8590c789d94a55e7e48d723bd37b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-systemd"

RDEPENDS:${PN} += "gdm"

inherit rpm
