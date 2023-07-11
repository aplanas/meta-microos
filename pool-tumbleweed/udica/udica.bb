SUMMARY = "A tool for generating SELinux security policies for containers"
DESCRIPTION = "Tool for generating SELinux security profiles for containers based on \
inspection of container JSON file."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.7"

RPM_NAME = "udica-0.2.7-1.2.noarch.rpm"
RPM_HASH = "73157d65548d6999ee644472474ac4b958d649e8db2e6434c1c5db5e2e7df9fc77cdf23f7e52d616781c62ab451651ff190f1214a97fc7a6e9951b07d4c26875"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-udica \
python3dist-udica \
udica"

RDEPENDS:${PN} += "/usr/bin/python3 \
container-selinux \
python-abi \
python3 \
python3-selinux \
python3-semanage \
python3-setuptools"

inherit rpm
