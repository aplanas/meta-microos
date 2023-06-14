SUMMARY = "A Sphinx extension for linking to a project's issue tracker"
DESCRIPTION = "A Sphinx extension for linking to a project's issue tracker. It \
includes roles for linking to issues as well as user profiles, with \
built-in support for GitHub (though this works with other services)."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-sphinx-issues-3.0.1-2.1.noarch.rpm"
RPM_HASH = "e90f40a4a8afbe6b2869d9ef87d86851612b6b2c0d01f4287ebcc29fa4ffd3ab008ed1bb71d028efcf005c522fda39c7e05887176650ec226f2f4f0c81de43c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-issues \
python3.10dist-sphinx-issues \
python310-sphinx-issues \
python3dist-sphinx-issues"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
