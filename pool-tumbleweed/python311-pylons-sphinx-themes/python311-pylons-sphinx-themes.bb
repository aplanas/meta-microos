SUMMARY = "Pylons Sphinx themes for documentation styling"
DESCRIPTION = "This repository is a Python package that contains Sphinx themes for Pylons \
related projects. This project is based on Pylons Sphinx Theme (singular), \
but uses a package implementation instead of git submodules and \
manual steps. \
 \
To use a theme in your Sphinx documentation, follow the guide in README.md."
LICENSE = "SUSE-Repoze"

PV = "1.0.13"

RPM_NAME = "python311-pylons-sphinx-themes-1.0.13-1.3.noarch.rpm"
RPM_HASH = "a8cbd6227677fee24b4d52aaa938421f9a8a4212aa922870e89ad3027247d9ef3a41089686758c954307563b92ad5e174fbdb3e8878d05286861b2a8d80de7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pylons-sphinx-themes \
python311-pylons-sphinx-theme \
python311-pylons-sphinx-themes \
python311-pylons-theme-support \
python3dist-pylons-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python311-Pygments"

inherit rpm
