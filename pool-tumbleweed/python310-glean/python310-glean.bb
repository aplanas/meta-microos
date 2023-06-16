SUMMARY = "Program to write static config from config-drive"
DESCRIPTION = "Glean is a program intended to configure a system based on configuration \
provided in a configuration drive. \
Different cloud providers have different ways of providing networking and \
other configuration to guest virtual-machines. Many use DHCP but others, \
notably Rackspace, use configuration provided via a configuration drive."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python310-glean-1.19.0-1.9.noarch.rpm"
RPM_HASH = "a3641e12af15caafe21a683031aaf222b6da7af7b3e480dd510a55cd79fcc6107f6528729a477baab5e13e639faaf2a696be7c02539030b6f3736ae3e28bcba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glean \
python3.10dist-glean \
python310-glean \
python3dist-glean"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
