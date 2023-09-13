SUMMARY = "Customizable Linux System Information Script"
DESCRIPTION = "HyFetch is a command line script to display information about your \
Linux system, such as amount of installed packages, OS and kernel \
version, active GTK theme, CPU info, and used/available memory. \
It is a fork of neofetch, and adds pride flag coloration to the OS logo."
LICENSE = "MIT"

PV = "1.4.10"

RPM_NAME = "python39-hyfetch-1.4.10-1.1.noarch.rpm"
RPM_HASH = "73d4d3e681d55c965af61423eb401fbbc827d0dedd2d79891239bf85c61ed685a8f7b8cb578bc32667b1b953a7cbee16162c09aad3e0c7850b7f27e367a4fd03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hyfetch \
python39-hyfetch \
python3dist-hyfetch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
python39-typing-extensions \
update-alternatives"

inherit rpm
