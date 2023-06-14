SUMMARY = "Sphinx extension to link to GitHub issues, pull requests, commits and users"
DESCRIPTION = "A Sphinx extension to link to GitHub issues, pull requests, commits \
and users for a particular project. \
 \
To use this extension, add it to the extensions list in conf.py, \
and set the variable github_project_url:"
LICENSE = "BSD-2-Clause"

PV = "1.2"

RPM_NAME = "python39-sphinxcontrib-github-alt-1.2-1.12.noarch.rpm"
RPM_HASH = "ad7271db51b9c64627678a65b804eed5ba77cac1b55f376bcc21d04c23e6738261ce8e1ed3db68a52f8a1d43e4b366bfef3462f0c119ab18e8c2a55b75035715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-github-alt \
python39-sphinxcontrib-github-alt \
python3dist-sphinxcontrib-github-alt"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-docutils"

inherit rpm
