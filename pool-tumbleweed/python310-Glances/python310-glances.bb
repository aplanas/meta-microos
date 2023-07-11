SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "python310-Glances-3.3.1-2.1.noarch.rpm"
RPM_HASH = "23e16d440dbb685c928a86d5f436eb13504e6910931e3a08c7d8f569daee2d56f3c7c07cb1dbce866dd9d7997bc74b76fba7fbe42b384175d4c8b2e1cd7e4368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances \
python3.10dist-glances \
python310-Glances \
python310-glances \
python3dist-glances"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-bottle \
python310-defusedxml \
python310-future \
python310-psutil \
python310-requests \
python310-ujson \
update-alternatives"

inherit rpm
