SUMMARY = "Program to write static config from config-drive"
DESCRIPTION = "Glean is a program intended to configure a system based on configuration \
provided in a configuration drive. \
Different cloud providers have different ways of providing networking and \
other configuration to guest virtual-machines. Many use DHCP but others, \
notably Rackspace, use configuration provided via a configuration drive."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python39-glean-1.19.0-1.10.noarch.rpm"
RPM_HASH = "ca630bcde337e5d33ad830c0ed7c33d26a8ea32d1ba9b0797d15455bb8922409ee4bf427e20ceacf05d95cb641e7563977a84c8ff0685e2bfaad271b71ff2906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-glean \
python39-glean \
python3dist-glean"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
