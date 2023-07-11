SUMMARY = "Systemd gdm.service file"
DESCRIPTION = "GDM's systemd service file. \
By default openSUSE uses xdm which enables the DM based on sysconfig. \
This package is only needed if the system administrator wishes to use \
'systemctl' instead of openSUSE's default 'update-alternatives' method."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-systemd-44.1-2.1.noarch.rpm"
RPM_HASH = "8c1390bf3a87d6330554e22c75aace51a1f04978d8d8d349cac3e70ad579e2cd9046a6b42f36cad0f1a622cc1a199654e49a56ee6b9f269f6512f1829baad2bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-systemd"

RDEPENDS:${PN} += "gdm"

inherit rpm
