SUMMARY = "A PEP8 equivalent for bash scripts"
DESCRIPTION = "A PEP8 equivalent for bash scripts \
 \
This program attempts to be an automated style checker for bash scripts \
to fill the same part of code review that pep8 does in most OpenStack \
projects. It started from humble beginnings in the DevStack project, \
and will continue to evolve over time. \
 \
- Documentation: http://docs.openstack.org/developer/bashate \
- Source: http://git.openstack.org/cgit/openstack-dev/bash8 \
- Bugs: http://bugs.launchpad.net/bash8"
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "python39-bashate-2.1.1-1.4.noarch.rpm"
RPM_HASH = "0b880c851913f2d3d17d8cba2d45614d53b20b732c697c3448de71ec30fb2ff99d458e78651b8f654dd73db95337eec8131422cf83478cdba718cf73188871e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bashate \
python39-bashate \
python3dist-bashate"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Babel \
python39-pbr \
update-alternatives"

inherit rpm
