SUMMARY = "Autoload driver for V4L2 loopback devices"
DESCRIPTION = "Configuration files to autoload the module during system startup."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-autoload-0.12.7-1.46.noarch.rpm"
RPM_HASH = "1dec64af968e0da5ac2576886179ccfb0bf86c74d9b758d4ea17098d1be54fc7529a10dd07cfe42f1f62f4f45e838dcc7acc863231237861ab86ed33e6e0aef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-autoload"

RDEPENDS:${PN} += "systemd"

inherit rpm
