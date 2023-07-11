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

RPM_NAME = "python39-bashate-2.1.1-1.5.noarch.rpm"
RPM_HASH = "47fb5327fcb1b1c34f0c0cbb33bfd3b39b035cc7ba6180c1ca1c5a79b1d51a03f1dbfff3c4fcd4f3ff63a2e0495e17d0259737857e00ce88b83d91f342b43c60"
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
