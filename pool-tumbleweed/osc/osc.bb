SUMMARY = "Command-line client for the Open Build Service"
DESCRIPTION = "openSUSE Commander is a command-line client for the Open Build Service. \
 \
See http://en.opensuse.org/openSUSE:OSC, as well as \
http://en.opensuse.org/openSUSE:Build_Service_Tutorial \
for a general introduction."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "osc-1.3.1-1.1.noarch.rpm"
RPM_HASH = "4b7e0070aa9c3f1478e0f22da5b83f16bd75e972bc83c200df154c9de396156b117f97a8f1a94786e3628b4069c6e52fa2ba27bb42ae9f2176f10e65b74b8006"
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
