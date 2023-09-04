SUMMARY = "Systemd gdm.service file"
DESCRIPTION = "GDM's systemd service file. \
By default openSUSE uses xdm which enables the DM based on sysconfig. \
This package is only needed if the system administrator wishes to use \
'systemctl' instead of openSUSE's default 'update-alternatives' method."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-systemd-44.1-3.1.noarch.rpm"
RPM_HASH = "f54ee7f3d99261d836a883099da7bcfab1d6d808b08177ddac77557819c4eb919e183bae4bebcf89e0febd5873a81e1806a42a27790512a0422646e20f80a60c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-systemd"

RDEPENDS:${PN} += "gdm"

inherit rpm
