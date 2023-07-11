SUMMARY = "Find a connected eth interface and create an ifcfg for it"
DESCRIPTION = "All available Ethernet network interfaces will be cycled \
until one is successfully configured. \
This script should run at the first boot of a machine \
that has several interfaces."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "network-autoconfig-1.0-4.11.noarch.rpm"
RPM_HASH = "b6a100d136521e9ddf6c98835ed76317a1443c26e5222c9a1a67c0ea2e529b5f8f3d7effc38fe0227b779ed06d18fbd2295d1c8c113592d986ca6eaf798c4e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "network-autoconfig"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
systemd \
wicked"

inherit rpm
