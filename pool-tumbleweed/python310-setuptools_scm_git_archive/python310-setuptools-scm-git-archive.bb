SUMMARY = "Git archive plugin setuptools_scm"
DESCRIPTION = "This is a setuptools_scm plugin that adds support for git archives \
(for example the ones GitHub automatically generates). \
 \
Note that it only works for archives of tagged commits (because git currently \
lacks a format option equivalent to git describe --tags)."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python310-setuptools_scm_git_archive-1.4-1.2.noarch.rpm"
RPM_HASH = "f35c07a225b6befb8dd8dbffef5d45715ad6d4b2511e3619ac43beeb740a3d688e62fed5d8d6066406e66478796e082c2b80fb31ff615d1a335cb73aaf0744a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools-scm-git-archive \
python310-setuptools-scm-git-archive \
python3dist-setuptools-scm-git-archive"

RDEPENDS:${PN} += "python-abi \
python310-setuptools-scm"

inherit rpm
