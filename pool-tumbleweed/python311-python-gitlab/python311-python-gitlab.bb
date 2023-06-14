SUMMARY = "Python module for interacting with the GitLab API"
DESCRIPTION = "The python-gitlab package provides access to the GitLab server API. \
 \
It supports the v4 API of GitLab, and provides a CLI tool (gitlab)."
LICENSE = "LGPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "python311-python-gitlab-3.12.0-2.4.noarch.rpm"
RPM_HASH = "1c8ae2a9e679da533d257faec93b65e74149e7cf6c84c4e45e6c99b34de45dfbe0c15e5a4f7874c2a74045bb1110c1f38f3902ea798cfa8bd0518e971d168a2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-gitlab \
python311-python-gitlab \
python3dist-python-gitlab"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-PyYAML \
python311-argcomplete \
python311-requests \
python311-requests-toolbelt \
python311-setuptools \
update-alternatives"

inherit rpm
