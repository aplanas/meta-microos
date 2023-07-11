SUMMARY = "A Sphinx extension for linking to a project's issue tracker"
DESCRIPTION = "A Sphinx extension for linking to a project's issue tracker. It \
includes roles for linking to issues as well as user profiles, with \
built-in support for GitHub (though this works with other services)."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-sphinx-issues-3.0.1-2.3.noarch.rpm"
RPM_HASH = "523841b114c46f9d1cbe5bc7f8621e135951c83659647e7f259a0b97d117978046199bf08250df5288e42c918fd9e637b4d40bec87239b89554253c56eba1aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-issues \
python310-sphinx-issues \
python3dist-sphinx-issues"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
