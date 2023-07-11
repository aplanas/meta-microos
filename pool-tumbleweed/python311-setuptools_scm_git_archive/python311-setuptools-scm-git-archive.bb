SUMMARY = "Git archive plugin setuptools_scm"
DESCRIPTION = "This is a setuptools_scm plugin that adds support for git archives \
(for example the ones GitHub automatically generates). \
 \
Note that it only works for archives of tagged commits (because git currently \
lacks a format option equivalent to git describe --tags)."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-setuptools_scm_git_archive-1.4-1.2.noarch.rpm"
RPM_HASH = "b21bfcd053316ca4d8dacc56b505198ce04479eefbf12a62e39fdc4336311d29d11eef213184912b250fd7dbc56fd6f26bfc491449e0f878622f0f03141fc56a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-scm-git-archive \
python3.11dist-setuptools-scm-git-archive \
python311-setuptools-scm-git-archive \
python3dist-setuptools-scm-git-archive"

RDEPENDS:${PN} += "python-abi \
python311-setuptools-scm"

inherit rpm
