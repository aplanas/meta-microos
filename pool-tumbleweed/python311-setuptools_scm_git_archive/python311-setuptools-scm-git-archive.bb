SUMMARY = "Git archive plugin setuptools_scm"
DESCRIPTION = "This is a setuptools_scm plugin that adds support for git archives \
(for example the ones GitHub automatically generates). \
 \
Note that it only works for archives of tagged commits (because git currently \
lacks a format option equivalent to git describe --tags)."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python311-setuptools_scm_git_archive-1.4-1.1.noarch.rpm"
RPM_HASH = "191e6c4b779da40b7ac75da51807ad86d6830d63e5f425a9ed2e061a774e01e0f62d241a1aaf3613a23139bb2b28be51fe90a01b3dab98e47c23d2419329b48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-scm-git-archive) \
python311-setuptools_scm_git_archive \
python3dist(setuptools-scm-git-archive)"

RDEPENDS:${PN} += "python(abi) \
python311-setuptools_scm"

inherit rpm
