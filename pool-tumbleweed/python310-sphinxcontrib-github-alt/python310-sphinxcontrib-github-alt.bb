SUMMARY = "Sphinx extension to link to GitHub issues, pull requests, commits and users"
DESCRIPTION = "A Sphinx extension to link to GitHub issues, pull requests, commits \
and users for a particular project. \
 \
To use this extension, add it to the extensions list in conf.py, \
and set the variable github_project_url:"
LICENSE = "BSD-2-Clause"

PV = "1.2"

RPM_NAME = "python310-sphinxcontrib-github-alt-1.2-1.14.noarch.rpm"
RPM_HASH = "20979bfc2192c36d6af1a68055de91eda116d01fe97fe934a13894d6db40c8b5c2687758137660bf6309f6231d4d9815992efd4b0f8bffc76cef8719329d63dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-github-alt \
python310-sphinxcontrib-github-alt \
python3dist-sphinxcontrib-github-alt"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-docutils"

inherit rpm
