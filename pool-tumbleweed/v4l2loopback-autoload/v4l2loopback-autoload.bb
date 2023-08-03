SUMMARY = "Autoload driver for V4L2 loopback devices"
DESCRIPTION = "Configuration files to autoload the module during system startup."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-autoload-0.12.7-1.49.noarch.rpm"
RPM_HASH = "9f9212f4d5cb04ff5e27a6d3e00ea5913fd2a4ca2742724dd9dcbbafb54d4fe54ec553fd61b0b0aec33c2b701a23a8d571b4b7b870d135ef047ea841056e9722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-autoload"

RDEPENDS:${PN} += "systemd"

inherit rpm
