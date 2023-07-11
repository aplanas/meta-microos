SUMMARY = "udev rules for libnitrokey"
DESCRIPTION = "Libnitrokey is a project to communicate with Nitrokey Pro and Storage devices \
in a clean and easy manner. \
 \
This package holds the udev rules."
LICENSE = "LGPL-3.0-only"

PV = "3.8"

RPM_NAME = "libnitrokey-udev-3.8-1.4.noarch.rpm"
RPM_HASH = "c434471a3e7cc3b94e3976413104f7d09c56adb29bd292539f872ddde002c32408d8f8a18346bcc84def8c40a37fdf7fdfbf3bc21637ea12e1fdd7f9b8cfe1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnitrokey-udev"

RDEPENDS:${PN} += ""

inherit rpm
