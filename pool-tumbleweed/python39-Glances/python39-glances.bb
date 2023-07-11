SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "python39-Glances-3.3.1-2.1.noarch.rpm"
RPM_HASH = "d60fa274578bea9d4cc07a5b12230cb7fafc949c21ebeb096b4610d8ff2dba37cbf20bc9cacea91088a735b98b9b27c7bae2bf164d6c91ae8d5c609e6177d5df"
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
python39-future \
python39-psutil \
python39-requests \
python39-ujson \
update-alternatives"

inherit rpm
