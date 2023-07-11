SUMMARY = "Authorize SSH public keys from online identities"
DESCRIPTION = "A command-line utility that imports SSH public keys to your authorized_keys \
file from online services like GitHub and Launchpad."
LICENSE = "GPL-3.0"

PV = "5.11"

RPM_NAME = "ssh-import-id-5.11-1.7.noarch.rpm"
RPM_HASH = "c920542fb67fb36d7ec442ea091daf0c63dcc35cffe80c04cf782b650a7457ab711a8b131eb6affbe8540196d89e4a775dc48d4e3c21868cbf83c0ce0d4ba86a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ssh-import-id \
python3dist-ssh-import-id \
ssh-import-id"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
openssh-common \
python-abi \
python3.11dist-distro \
python3.11dist-setuptools"

inherit rpm
