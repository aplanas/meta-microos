SUMMARY = "Command-line client for the Open Build Service"
DESCRIPTION = "openSUSE Commander is a command-line client for the Open Build Service. \
 \
See http://en.opensuse.org/openSUSE:OSC, as well as \
http://en.opensuse.org/openSUSE:Build_Service_Tutorial \
for a general introduction."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "osc-1.2.0-1.1.noarch.rpm"
RPM_HASH = "321a3082b10e7cccfb94645f6ce8c6e6d4cf4cf90b6009120d37018eaf720828a84cd0ab55a5e5a62dd39837f3f039dcd32801068b1e3a2edf9afe7cb913c91b"
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
