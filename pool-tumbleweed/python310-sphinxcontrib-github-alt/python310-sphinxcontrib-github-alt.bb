SUMMARY = "Sphinx extension to link to GitHub issues, pull requests, commits and users"
DESCRIPTION = "A Sphinx extension to link to GitHub issues, pull requests, commits \
and users for a particular project. \
 \
To use this extension, add it to the extensions list in conf.py, \
and set the variable github_project_url:"
LICENSE = "BSD-2-Clause"

PV = "1.2"

RPM_NAME = "python310-sphinxcontrib-github-alt-1.2-1.12.noarch.rpm"
RPM_HASH = "2908fc3324a6a568f0bbd18c04325b7bd6b6a96bbf6054e374478d71391f12bd71c0cfbb1105fddcd8871d2b9bef042529e5ab14cc5182724eaad418c31870e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-github-alt \
python3.10dist(sphinxcontrib-github-alt) \
python310-sphinxcontrib-github-alt \
python3dist(sphinxcontrib-github-alt)"
RDEPENDS:${PN} += "python(abi) \
python310-Sphinx \
python310-docutils"

inherit rpm
