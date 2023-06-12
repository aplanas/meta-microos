SUMMARY = "Python Module Implementing the ManageSieve Protocol"
DESCRIPTION = "python-managesieve is a Python module implementing the ManageSieve client \
protocol. It also includes an user application (the interactive sieveshell)."
LICENSE = "GPL-3.0-or-later & Python-2.0"

PV = "0.7.1"

RPM_NAME = "python39-managesieve-0.7.1-1.9.noarch.rpm"
RPM_HASH = "d30d65f2888e8cd7cadf42edf28e833cd0a0b2ad97370a7e170fc1068a0144bfb4fdcb44602ccb2115cc665ae71da9b062891ea6501e0755b722af6d1fce5bf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(managesieve) \
python39-managesieve \
python3dist(managesieve)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
