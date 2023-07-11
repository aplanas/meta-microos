SUMMARY = "Python Module Implementing the ManageSieve Protocol"
DESCRIPTION = "python-managesieve is a Python module implementing the ManageSieve client \
protocol. It also includes an user application (the interactive sieveshell)."
LICENSE = "GPL-3.0-or-later & Python-2.0"

PV = "0.7.1"

RPM_NAME = "python311-managesieve-0.7.1-1.11.noarch.rpm"
RPM_HASH = "ea828c15032b8fd3319048df2ab11447307eb4e4bc3b03af8894b64f808ab940d215054a33479aa28bf8b8764f8146a2eae792a1bb2f25c63caa67abd53f9f51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-managesieve \
python3.11dist-managesieve \
python311-managesieve \
python3dist-managesieve"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
