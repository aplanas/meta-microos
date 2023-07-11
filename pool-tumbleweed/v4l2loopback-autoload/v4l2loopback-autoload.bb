SUMMARY = "Autoload driver for V4L2 loopback devices"
DESCRIPTION = "Configuration files to autoload the module during system startup."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.7"

RPM_NAME = "v4l2loopback-autoload-0.12.7-1.45.noarch.rpm"
RPM_HASH = "21f5e052b549c1c7044f1d083616e5af4b95a7ecec7860e6dba2933e0cc0b03a9812e5e3357f8cc4bddb8cb355ef98ed649f918bea5cd54fec7fb16cb376c6ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "v4l2loopback-autoload"

RDEPENDS:${PN} += "systemd"

inherit rpm
