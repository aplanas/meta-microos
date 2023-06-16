SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "python310-Glances-3.3.1-1.1.noarch.rpm"
RPM_HASH = "662b35712aa3b59307cb315a8f770dd7fbc509286886eecb80e052a7f70439f5d0b125fe47213dbe8660add1ceb6566035ca3dc2e94bb3caaec763f9855e8de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances \
python3-Glances \
python3-glances \
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
