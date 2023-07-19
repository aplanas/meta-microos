SUMMARY = "ARA Records Ansible"
DESCRIPTION = "ARA saves playbook results to a local or remote database by using an \
Ansible callback plugin and provides an API to integrate this data in \
tools and interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.8"

RPM_NAME = "python3-ara-1.5.8-2.1.noarch.rpm"
RPM_HASH = "282ecca0f6a52c0d4cbbb13c22f3bbd6ab19d76421baedf5ae6536fc7c914adab0b9d8613a5773943cf9205af02a35741deb8e3a69e8bca920237835a14400fd"
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
