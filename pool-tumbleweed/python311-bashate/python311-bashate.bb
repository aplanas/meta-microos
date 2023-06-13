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

RPM_NAME = "python311-bashate-2.1.1-1.4.noarch.rpm"
RPM_HASH = "e6004df5ec1190280778dd2e36b81f6513cc91f4c9690953f32cef396e4f3fb0fa7d6e4fb293cea2d3a406983abb1c8613e692f80f15c44832f187fae692383e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bashate) \
python311-bashate \
python3dist(bashate)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Babel \
python311-pbr \
update-alternatives"

inherit rpm
