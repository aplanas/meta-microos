SUMMARY = "Command-line client for the Open Build Service"
DESCRIPTION = "OpenSUSE Commander is a command-line client for the Open Build Service. \
 \
See http://en.opensuse.org/openSUSE:OSC, as well as \
http://en.opensuse.org/openSUSE:Build_Service_Tutorial \
for a general introduction."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.4"

RPM_NAME = "osc-1.1.4-1.2.noarch.rpm"
RPM_HASH = "62e65053ecc3200414e10c97a96ded3fea2dd90035063c5904331695fb7c6ac2dd38ac8dbe752e75a76f91b981d767d25ddb2df7638c991c20c819c3c3f7e433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osc \
python3-osc \
python3.11dist-osc \
python3dist-osc \
rpm-macro-osc-plugin-dir"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python-abi \
python3-cryptography \
python3-rpm \
python3-urllib3"

inherit rpm
