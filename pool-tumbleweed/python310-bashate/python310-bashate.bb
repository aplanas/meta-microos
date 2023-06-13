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

RPM_NAME = "python310-bashate-2.1.1-1.4.noarch.rpm"
RPM_HASH = "f7e25b5cef5c66c6d3830c9ec8cff1845f61d8bcad081696a2abca87f2ad19e58e5fe6b34fb3fd1a5ab60bf69163163cad77b32331df5339118d7ae9661d0ea5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bashate \
python3.10dist(bashate) \
python310-bashate \
python3dist(bashate)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Babel \
python310-pbr \
update-alternatives"

inherit rpm
