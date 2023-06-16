SUMMARY = "Program to write static config from config-drive"
DESCRIPTION = "Glean is a program intended to configure a system based on configuration \
provided in a configuration drive. \
Different cloud providers have different ways of providing networking and \
other configuration to guest virtual-machines. Many use DHCP but others, \
notably Rackspace, use configuration provided via a configuration drive."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python311-glean-1.19.0-1.9.noarch.rpm"
RPM_HASH = "9b2457b2c6c3ee4f60ad1d20431c38d375a550dab76b9a257828a7f86bb59499b216f30fbf13804921021ed3a8026dfb410f176002c6fdddefb8410b3c1bf81d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-glean \
python311-glean \
python3dist-glean"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
