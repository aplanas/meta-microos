SUMMARY = "Autoload driver for V4L2 loopback devices"
DESCRIPTION = "Configuration files to autoload the module during system startup."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-autoload-0.12.7-1.53.noarch.rpm"
RPM_HASH = "bcdb22a6816945be91826e4ce5f93f975560fdc6726df4154d2124e56ef54a565edc50d0dcd0b1548bb3864938f51f3e43213d76ad54225d44cca997392c6690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-autoload"

RDEPENDS:${PN} += "systemd"

inherit rpm
