SUMMARY = "Python module for interacting with the GitLab API"
DESCRIPTION = "The python-gitlab package provides access to the GitLab server API. \
 \
It supports the v4 API of GitLab, and provides a CLI tool (gitlab)."
LICENSE = "LGPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "python39-python-gitlab-3.12.0-2.4.noarch.rpm"
RPM_HASH = "d3ef98cd6cdd831dfd5eeddffbb18c4f685c819459692a9dc6639bb816b477754132280aa8d2152021972f91fd21aa1968dfd71a31b0a902ef3a0e5e0c3c4429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-gitlab \
python39-python-gitlab \
python3dist-python-gitlab"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyYAML \
python39-argcomplete \
python39-requests \
python39-requests-toolbelt \
python39-setuptools \
update-alternatives"

inherit rpm
