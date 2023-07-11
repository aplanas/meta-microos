SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "python311-Glances-3.3.1-2.1.noarch.rpm"
RPM_HASH = "3f752e9315cb703e085496ae31b44198a08c1877583f4ef90292e16a47f72cfdc7b34121f33e90f42189736c09ad832f15a56b3d78ed14df012527f4a843ab77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances \
python3-Glances \
python3-glances \
python3.11dist-glances \
python311-Glances \
python311-glances \
python3dist-glances"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-bottle \
python311-defusedxml \
python311-future \
python311-psutil \
python311-requests \
python311-ujson \
update-alternatives"

inherit rpm
