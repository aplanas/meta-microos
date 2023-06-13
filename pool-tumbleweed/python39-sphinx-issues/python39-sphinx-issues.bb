SUMMARY = "A Sphinx extension for linking to a project's issue tracker"
DESCRIPTION = "A Sphinx extension for linking to a project's issue tracker. It \
includes roles for linking to issues as well as user profiles, with \
built-in support for GitHub (though this works with other services)."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-sphinx-issues-3.0.1-2.1.noarch.rpm"
RPM_HASH = "41f922583dc69eadac8aa2fd31acd6db43ad522cef3f57ef1c2433b84a18446ebe93d32ef132dabf2ca67b4a758f6abe6546cdba53a00e3a34403fe05a73aa29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-issues) \
python39-sphinx-issues \
python3dist(sphinx-issues)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
