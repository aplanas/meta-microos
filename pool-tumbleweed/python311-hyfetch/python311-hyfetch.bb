SUMMARY = "Customizable Linux System Information Script"
DESCRIPTION = "HyFetch is a command line script to display information about your \
Linux system, such as amount of installed packages, OS and kernel \
version, active GTK theme, CPU info, and used/available memory. \
It is a fork of neofetch, and adds pride flag coloration to the OS logo."
LICENSE = "MIT"

PV = "1.4.10"

RPM_NAME = "python311-hyfetch-1.4.10-1.1.noarch.rpm"
RPM_HASH = "0f431564bedf8bd4fa8aa262a11be8c31232cfd37b0dca92c5eb8b2727069584d93bd57b030097c796f577097c16392bf2d9f2226d67645e2d0529add99e4fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hyfetch \
python3.11dist-hyfetch \
python311-hyfetch \
python3dist-hyfetch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
python311-typing-extensions \
update-alternatives"

inherit rpm
