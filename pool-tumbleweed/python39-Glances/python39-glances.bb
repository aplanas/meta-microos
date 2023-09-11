SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "3.4.0.3"

RPM_NAME = "python39-Glances-3.4.0.3-1.1.noarch.rpm"
RPM_HASH = "ccb7816cc3b43a3d2ab97cb8c9df5c6958a9a3dcde75d2b5356724555d6e4fcb47affa41935c94359e82c5244dbb5c8718981ff5e45876319c57687d7e38e401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances \
python3.9dist-glances \
python39-Glances \
python39-glances \
python3dist-glances"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-bottle \
python39-defusedxml \
python39-packaging \
python39-psutil \
python39-requests \
python39-ujson \
update-alternatives"

inherit rpm
