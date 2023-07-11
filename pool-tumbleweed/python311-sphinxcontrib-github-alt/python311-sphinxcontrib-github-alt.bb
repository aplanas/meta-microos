SUMMARY = "Sphinx extension to link to GitHub issues, pull requests, commits and users"
DESCRIPTION = "A Sphinx extension to link to GitHub issues, pull requests, commits \
and users for a particular project. \
 \
To use this extension, add it to the extensions list in conf.py, \
and set the variable github_project_url:"
LICENSE = "BSD-2-Clause"

PV = "1.2"

RPM_NAME = "python311-sphinxcontrib-github-alt-1.2-1.14.noarch.rpm"
RPM_HASH = "3e454f5548b7040c506b80e83e1aeedf7a7f52f1034bf88139a3ce82a48ebae872615a127933ae21b490423d84c19b19116f296856a97ff7e6ca3317794f5055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-github-alt \
python3.11dist-sphinxcontrib-github-alt \
python311-sphinxcontrib-github-alt \
python3dist-sphinxcontrib-github-alt"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-docutils"

inherit rpm
