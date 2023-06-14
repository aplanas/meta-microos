SUMMARY = "Git archive plugin setuptools_scm"
DESCRIPTION = "This is a setuptools_scm plugin that adds support for git archives \
(for example the ones GitHub automatically generates). \
 \
Note that it only works for archives of tagged commits (because git currently \
lacks a format option equivalent to git describe --tags)."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-setuptools_scm_git_archive-1.4-1.1.noarch.rpm"
RPM_HASH = "586adcac9f5694f40ee1d01c95f8e990ea937ad15a809b3730eb9cde2992439f7c3239c0c3d5079c8ed9ae03b9efd4af51e7d82d3620a43613d7a1f62dbe7484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-scm-git-archive \
python39-setuptools-scm-git-archive \
python3dist-setuptools-scm-git-archive"

RDEPENDS:${PN} += "python-abi \
python39-setuptools-scm"

inherit rpm
