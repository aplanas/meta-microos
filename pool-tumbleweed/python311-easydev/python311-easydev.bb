SUMMARY = "Common utilities to ease the development of Python packages"
DESCRIPTION = "The easydev package  provides miscellaneous functions that are \
repeatedly used during the development of Python packages. The goal \
is to help developers on speeding up their own dev. It has been used \
also as an incubator for other packages and is stable."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python311-easydev-0.12.1-2.4.noarch.rpm"
RPM_HASH = "8c76623091f8b2d0a21ee3e2de90ee35bffd9fb6d32f2c67dc05eda9a80b3ef9d67cec00a57e53c420094d34c4ab6924b4484e77ebb6eb4f698fe33e3c1f1d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easydev \
python3.11dist-easydev \
python311-easydev \
python3dist-easydev"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-colorama \
python311-colorlog \
python311-pexpect \
python311-setuptools \
update-alternatives"

inherit rpm
