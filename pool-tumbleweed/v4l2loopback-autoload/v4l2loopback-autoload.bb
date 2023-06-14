SUMMARY = "Autoload driver for V4L2 loopback devices"
DESCRIPTION = "Configuration files to autoload the module during system startup."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-autoload-0.12.7-1.39.noarch.rpm"
RPM_HASH = "2e59988dd42973bfc027e7450f23d0fbb16c46e6ce55de97ac829e4e4b6fdbc7fb1b0f8c1f063493454c4b3effdb3146ee12dae80c98ca92bbfaacb40ea2ddc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-autoload"

RDEPENDS:${PN} += "systemd"

inherit rpm
