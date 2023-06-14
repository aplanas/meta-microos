SUMMARY = "Udev rules for FreeSRP"
DESCRIPTION = "Udev rules for FreeSRP SDR hardware"
LICENSE = "GPL-3.0"

PV = "0.3.0"

RPM_NAME = "freesrp-udev-0.3.0-1.27.aarch64.rpm"
RPM_HASH = "c63169794aa298645473b392f63550e7af19c690f14e531b480bccfbad4955c402d858c5ca104c2417441a5bbd7328eb4f7d2ad8e0dc01394c26dd0a251aa604"

RPROVIDES:${PN} += "freesrp-udev"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
