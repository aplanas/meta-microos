SUMMARY = "A Sphinx extension for linking to a project's issue tracker"
DESCRIPTION = "A Sphinx extension for linking to a project's issue tracker. It \
includes roles for linking to issues as well as user profiles, with \
built-in support for GitHub (though this works with other services)."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-sphinx-issues-3.0.1-2.1.noarch.rpm"
RPM_HASH = "2cb34869753cdcb50190c17d00f21fc5aa1e25a161f7536e9eae10b21f3fe773cc12a62ca5e79cb692b3184c95062776e58e878f1931b075abf735a423c91da4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sphinx-issues \
python311-sphinx-issues \
python3dist-sphinx-issues"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
