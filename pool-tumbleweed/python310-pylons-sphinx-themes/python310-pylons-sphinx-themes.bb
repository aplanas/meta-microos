SUMMARY = "Pylons Sphinx themes for documentation styling"
DESCRIPTION = "This repository is a Python package that contains Sphinx themes for Pylons \
related projects. This project is based on Pylons Sphinx Theme (singular), \
but uses a package implementation instead of git submodules and \
manual steps. \
 \
To use a theme in your Sphinx documentation, follow the guide in README.md."
LICENSE = "SUSE-Repoze"

PV = "1.0.13"

RPM_NAME = "python310-pylons-sphinx-themes-1.0.13-2.2.noarch.rpm"
RPM_HASH = "3a117a40de8e9626b627bc9646d00489b3e7a2fb72c4bb059e7cb19bd6e0dc59c2b23de5325f2fd9253cb05e464b8dc5bfc8b2cdfd68a161df12a0a7c4ebcebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylons-sphinx-themes \
python310-pylons-sphinx-theme \
python310-pylons-sphinx-themes \
python310-pylons-theme-support \
python3dist-pylons-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python310-Pygments"

inherit rpm
