SUMMARY = "A Sphinx extension for linking to a project's issue tracker"
DESCRIPTION = "A Sphinx extension for linking to a project's issue tracker. It \
includes roles for linking to issues as well as user profiles, with \
built-in support for GitHub (though this works with other services)."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python311-sphinx-issues-3.0.1-2.3.noarch.rpm"
RPM_HASH = "5bc8b0326ea4921d71d1ef5a991b55aa72b2b6a2c7d6156a8dcaa1a060bf7ce53618b9385ff98c095609387c5b92f466b0913f305b579953d95755afb86d3c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-issues \
python3.11dist-sphinx-issues \
python311-sphinx-issues \
python3dist-sphinx-issues"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
