SUMMARY = "Git archive plugin setuptools_scm"
DESCRIPTION = "This is a setuptools_scm plugin that adds support for git archives \
(for example the ones GitHub automatically generates). \
 \
Note that it only works for archives of tagged commits (because git currently \
lacks a format option equivalent to git describe --tags)."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python310-setuptools_scm_git_archive-1.4-1.1.noarch.rpm"
RPM_HASH = "e7ebf5189c5eef1479ebb9e89c021ce00d041b47b4c2109fe86a24d5bab65e60dc11d7e2af322756ba8c32922941bad56a43f776d1381a70d016f71b01d88846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools_scm_git_archive \
python3.10dist(setuptools-scm-git-archive) \
python310-setuptools_scm_git_archive \
python3dist(setuptools-scm-git-archive)"
RDEPENDS:${PN} += "python(abi) \
python310-setuptools_scm"

inherit rpm
