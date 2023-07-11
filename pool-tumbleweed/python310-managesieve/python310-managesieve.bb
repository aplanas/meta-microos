SUMMARY = "Python Module Implementing the ManageSieve Protocol"
DESCRIPTION = "python-managesieve is a Python module implementing the ManageSieve client \
protocol. It also includes an user application (the interactive sieveshell)."
LICENSE = "GPL-3.0-or-later & Python-2.0"

PV = "0.7.1"

RPM_NAME = "python310-managesieve-0.7.1-1.11.noarch.rpm"
RPM_HASH = "29ae8a7921852a9ae79b381eb9a3118b557e1386be3a298012801793aa45ad7e06b329164b1553c5389c915900838e40a07193c56312f69c69e55fe51f39e940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-managesieve \
python310-managesieve \
python3dist-managesieve"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
