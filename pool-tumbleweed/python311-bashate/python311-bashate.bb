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

RPM_NAME = "python311-bashate-2.1.1-1.5.noarch.rpm"
RPM_HASH = "e259dc10db444a1770553217d4e5fc14ab3e1b9f910a7466de0f0cc37db9cd0f2e3457470c15dd8c454e79a9a46266dde3a0df353b2f6196ed2b040b05808944"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bashate \
python3.11dist-bashate \
python311-bashate \
python3dist-bashate"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Babel \
python311-pbr \
update-alternatives"

inherit rpm
