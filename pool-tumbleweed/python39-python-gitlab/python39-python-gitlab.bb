SUMMARY = "Python module for interacting with the GitLab API"
DESCRIPTION = "The python-gitlab package provides access to the GitLab server API. \
 \
It supports the v4 API of GitLab, and provides a CLI tool (gitlab)."
LICENSE = "LGPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "python39-python-gitlab-3.12.0-2.6.noarch.rpm"
RPM_HASH = "3c5a615c499ac2afa0b853d9add802a9bf3becd3de3982e7da0324d93e1630de32d589340a3a9e4c324a0779e0cdb0d632eb8eed7599187c1727f6d11088f05d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-gitlab \
python39-python-gitlab \
python3dist-python-gitlab"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-argcomplete \
python39-requests \
python39-requests-toolbelt \
python39-setuptools \
update-alternatives"

inherit rpm
