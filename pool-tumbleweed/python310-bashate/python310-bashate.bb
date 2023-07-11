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

RPM_NAME = "python310-bashate-2.1.1-1.5.noarch.rpm"
RPM_HASH = "3e976040e94ad09b4773c0da5117a34c5fd8e348accfc9de7aa8624014987246902b82b0bfeb262fb6dbc338c9efd6ac89278edd9b6e5aa1bc6f6eabe30c284c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bashate \
python310-bashate \
python3dist-bashate"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Babel \
python310-pbr \
update-alternatives"

inherit rpm
