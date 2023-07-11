SUMMARY = "Program to write static config from config-drive"
DESCRIPTION = "Glean is a program intended to configure a system based on configuration \
provided in a configuration drive. \
Different cloud providers have different ways of providing networking and \
other configuration to guest virtual-machines. Many use DHCP but others, \
notably Rackspace, use configuration provided via a configuration drive."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python311-glean-1.19.0-1.10.noarch.rpm"
RPM_HASH = "f30eba6512f0029af63e6ee5505a8c60e4f188385c14009a2011045b681d1c9402a750b7f9cde63d30dd50422058d035d97e233a7e25970f53821379702f0fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glean \
python3.11dist-glean \
python311-glean \
python3dist-glean"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
