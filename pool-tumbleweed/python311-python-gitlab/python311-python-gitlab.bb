SUMMARY = "Python module for interacting with the GitLab API"
DESCRIPTION = "The python-gitlab package provides access to the GitLab server API. \
 \
It supports the v4 API of GitLab, and provides a CLI tool (gitlab)."
LICENSE = "LGPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "python311-python-gitlab-3.12.0-2.6.noarch.rpm"
RPM_HASH = "fc4ce5b8fd2850a57dce5f717e2d3749f28ad1bf40ac187736027879270ade3651376e2875275fa811b36e0fd6c27d45a97d25fba317a38a438b51c9feb534c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-gitlab \
python3.11dist-python-gitlab \
python311-python-gitlab \
python3dist-python-gitlab"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-argcomplete \
python311-requests \
python311-requests-toolbelt \
python311-setuptools \
update-alternatives"

inherit rpm
