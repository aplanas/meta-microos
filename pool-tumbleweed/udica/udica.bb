SUMMARY = "A tool for generating SELinux security policies for containers"
DESCRIPTION = "Tool for generating SELinux security profiles for containers based on \
inspection of container JSON file."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.7"

RPM_NAME = "udica-0.2.7-1.1.noarch.rpm"
RPM_HASH = "598209519baf599deb3350db3124f9f753cee9e8c64380b1990d74f2fc250f0801024aff3cc86a41577313eb06fdeb2bd8ee665a951e54051ca929bcf5b366ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(udica) \
python3dist(udica) \
udica"

RDEPENDS:${PN} += "/usr/bin/python3 \
container-selinux \
python(abi) \
python3 \
python3-selinux \
python3-semanage \
python3-setuptools"

inherit rpm
