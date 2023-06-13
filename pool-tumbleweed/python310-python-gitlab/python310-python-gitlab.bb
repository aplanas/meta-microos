SUMMARY = "Python module for interacting with the GitLab API"
DESCRIPTION = "The python-gitlab package provides access to the GitLab server API. \
 \
It supports the v4 API of GitLab, and provides a CLI tool (gitlab)."
LICENSE = "LGPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "python310-python-gitlab-3.12.0-2.4.noarch.rpm"
RPM_HASH = "e65233eb776416dcc8429be9d823834903c9438a661ca9ec120b77d0e15cb45e05488d628daa526bc2d31f98c1a710b6842899a7660421f22a0fbd9ca83abb62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-gitlab \
python3.10dist(python-gitlab) \
python310-python-gitlab \
python3dist(python-gitlab)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-argcomplete \
python310-requests \
python310-requests-toolbelt \
python310-setuptools \
update-alternatives"

inherit rpm
