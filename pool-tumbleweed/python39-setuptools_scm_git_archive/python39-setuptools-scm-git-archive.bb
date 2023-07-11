SUMMARY = "Git archive plugin setuptools_scm"
DESCRIPTION = "This is a setuptools_scm plugin that adds support for git archives \
(for example the ones GitHub automatically generates). \
 \
Note that it only works for archives of tagged commits (because git currently \
lacks a format option equivalent to git describe --tags)."
LICENSE = "MIT"

PV = "1.4"

RPM_NAME = "python39-setuptools_scm_git_archive-1.4-1.2.noarch.rpm"
RPM_HASH = "09d564b3689a650efe4f19ac81ac70756d4f091afe51ba94e9c93992326a47d2dd184791b18949807417b0eb233ee1793fd17c401f0e17c5301b40472f048b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-scm-git-archive \
python39-setuptools-scm-git-archive \
python3dist-setuptools-scm-git-archive"

RDEPENDS:${PN} += "python-abi \
python39-setuptools-scm"

inherit rpm
