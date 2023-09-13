SUMMARY = "Customizable Linux System Information Script"
DESCRIPTION = "HyFetch is a command line script to display information about your \
Linux system, such as amount of installed packages, OS and kernel \
version, active GTK theme, CPU info, and used/available memory. \
It is a fork of neofetch, and adds pride flag coloration to the OS logo."
LICENSE = "MIT"

PV = "1.4.10"

RPM_NAME = "python310-hyfetch-1.4.10-1.1.noarch.rpm"
RPM_HASH = "cc77072b8192e443326183f4b5c751af26e03ef941ca12af02ffa94668428e4d7dc83f8430916515124fea3bc210a740a4f5e4bf821f58756d56ea0944bc89f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hyfetch \
python310-hyfetch \
python3dist-hyfetch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
python310-typing-extensions \
update-alternatives"

inherit rpm
