SUMMARY = "Program to write static config from config-drive"
DESCRIPTION = "Glean is a program intended to configure a system based on configuration \
provided in a configuration drive. \
Different cloud providers have different ways of providing networking and \
other configuration to guest virtual-machines. Many use DHCP but others, \
notably Rackspace, use configuration provided via a configuration drive."
LICENSE = "Apache-2.0"

PV = "1.19.0"

RPM_NAME = "python310-glean-1.19.0-1.10.noarch.rpm"
RPM_HASH = "4ed46551bdced517f548f7f5b8f518cb7bd25b25db2a955d8dd80f455bf13fb4ef58b81751d3d083270f43704e9878ebaf19fc5a5a15ce4e64e00482ed16e97d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-glean \
python310-glean \
python3dist-glean"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
