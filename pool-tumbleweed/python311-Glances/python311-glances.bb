SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "3.4.0.3"

RPM_NAME = "python311-Glances-3.4.0.3-1.1.noarch.rpm"
RPM_HASH = "4b17a57cdd918b9a63707441904d4db93ad646f161307b52179c68061fc7ce268a614d81d710bd43204d37eab0958a313f9efc360b8af44955a30da09b8de9bb"
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
python311-packaging \
python311-psutil \
python311-requests \
python311-ujson \
update-alternatives"

inherit rpm
