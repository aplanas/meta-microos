SUMMARY = "ARA Records Ansible"
DESCRIPTION = "ARA saves playbook results to a local or remote database by using an \
Ansible callback plugin and provides an API to integrate this data in \
tools and interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.1"

RPM_NAME = "python3-ara-1.6.1-1.1.noarch.rpm"
RPM_HASH = "d2d868e6a8edfc24628d5b91d75353f4b3d4c2ee85c6585aa72734636f9776bb901be8ac62a6ae785cc76f7d04e2940f06fd3e01f255a5367bc3e40f92c6fb6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ara \
python3.11dist-ara \
python3dist-ara"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-cliff \
python3-pbr \
python3-requests \
update-alternatives"

inherit rpm
