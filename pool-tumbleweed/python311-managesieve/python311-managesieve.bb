SUMMARY = "Python Module Implementing the ManageSieve Protocol"
DESCRIPTION = "python-managesieve is a Python module implementing the ManageSieve client \
protocol. It also includes an user application (the interactive sieveshell)."
LICENSE = "GPL-3.0-or-later & Python-2.0"

PV = "0.7.1"

RPM_NAME = "python311-managesieve-0.7.1-1.9.noarch.rpm"
RPM_HASH = "f71f7772e75cd7db68ef9ea838102d61827cc62520c715ce0d8e7e13584df3b65eebc23877c1aeb6b4d50a0b9420440342261c72c0e05bbb78caa3761b9d0a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-managesieve \
python311-managesieve \
python3dist-managesieve"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
