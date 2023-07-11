SUMMARY = "ARA Records Ansible"
DESCRIPTION = "ARA saves playbook results to a local or remote database by using an \
Ansible callback plugin and provides an API to integrate this data in \
tools and interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.8"

RPM_NAME = "python3-ara-1.5.8-1.5.noarch.rpm"
RPM_HASH = "c829de11f63d792905e9f81d10f785d3e2656151ea6eca012287e022153853edc633b3fb1e8c1687c57ad6b7d0f1ad670ec87b3382890d0ee4edeb185f624ecd"
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
