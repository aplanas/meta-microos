SUMMARY = "A Sphinx extension for linking to a project's issue tracker"
DESCRIPTION = "A Sphinx extension for linking to a project's issue tracker. It \
includes roles for linking to issues as well as user profiles, with \
built-in support for GitHub (though this works with other services)."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-sphinx-issues-3.0.1-2.3.noarch.rpm"
RPM_HASH = "782e0fd5c00526a1f58ba213a3bb323101068500d70dbfc9da559067280de793fb8ff062f962d5c6e73c52b415239da727e9134cbb651f2670d8b5994d99a83d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-issues \
python39-sphinx-issues \
python3dist-sphinx-issues"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
