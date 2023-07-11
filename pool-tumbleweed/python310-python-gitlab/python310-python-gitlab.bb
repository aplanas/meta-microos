SUMMARY = "Python module for interacting with the GitLab API"
DESCRIPTION = "The python-gitlab package provides access to the GitLab server API. \
 \
It supports the v4 API of GitLab, and provides a CLI tool (gitlab)."
LICENSE = "LGPL-3.0-only"

PV = "3.12.0"

RPM_NAME = "python310-python-gitlab-3.12.0-2.6.noarch.rpm"
RPM_HASH = "f566ecaaf6f0dc300bcefe45fb5bfcd4ff61047354a6d40d1a71a157289b5abb0702a9311ed844e99d620d7cd2beaa5f8a9345a428e0275444199ce0534498b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-gitlab \
python310-python-gitlab \
python3dist-python-gitlab"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-argcomplete \
python310-requests \
python310-requests-toolbelt \
python310-setuptools \
update-alternatives"

inherit rpm
