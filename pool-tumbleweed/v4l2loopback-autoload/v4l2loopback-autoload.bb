SUMMARY = "Autoload driver for V4L2 loopback devices"
DESCRIPTION = "Configuration files to autoload the module during system startup."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-autoload-0.12.7-1.47.noarch.rpm"
RPM_HASH = "a3d56f77def30d5456fd783649b5236d7799dc4944df035fc489e9f9a328c3d2f0d3092b46a8a9fc4d64f5898974f07814b60dc2abeefa9161a8cb28bb1d2256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-autoload"

RDEPENDS:${PN} += "systemd"

inherit rpm
