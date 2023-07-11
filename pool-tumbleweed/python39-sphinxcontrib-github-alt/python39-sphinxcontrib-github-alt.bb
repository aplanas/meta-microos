SUMMARY = "Sphinx extension to link to GitHub issues, pull requests, commits and users"
DESCRIPTION = "A Sphinx extension to link to GitHub issues, pull requests, commits \
and users for a particular project. \
 \
To use this extension, add it to the extensions list in conf.py, \
and set the variable github_project_url:"
LICENSE = "BSD-2-Clause"

PV = "1.2"

RPM_NAME = "python39-sphinxcontrib-github-alt-1.2-1.14.noarch.rpm"
RPM_HASH = "b36d28627fa3da1be7ad4227271b6e3e495a320ec6e00b4a2551884c543c9a2a893f3778657708026e0a97acb67b0041bc37774f5117d838106b697a3cb30097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-github-alt \
python39-sphinxcontrib-github-alt \
python3dist-sphinxcontrib-github-alt"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-docutils"

inherit rpm
