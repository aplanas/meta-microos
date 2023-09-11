SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "3.4.0.3"

RPM_NAME = "python310-Glances-3.4.0.3-1.1.noarch.rpm"
RPM_HASH = "a89f555981ded5d9bad86d1e357108f3c71b44e516bec6224112d176f1bb8e9a4903eda9f48d9aa367babac4ed3ee08ec553eafe1ed999f36b4e802736175ece"
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
python310-packaging \
python310-psutil \
python310-requests \
python310-ujson \
update-alternatives"

inherit rpm
