SUMMARY = "Pylons Sphinx themes for documentation styling"
DESCRIPTION = "This repository is a Python package that contains Sphinx themes for Pylons \
related projects. This project is based on Pylons Sphinx Theme (singular), \
but uses a package implementation instead of git submodules and \
manual steps. \
 \
To use a theme in your Sphinx documentation, follow the guide in README.md."
LICENSE = "SUSE-Repoze"

PV = "1.0.13"

RPM_NAME = "python39-pylons-sphinx-themes-1.0.13-2.2.noarch.rpm"
RPM_HASH = "ec72f94b9c8bcb4990a9857db72860e2e3bef4c82c4dfec84c3fd2567f5673278651d7b1736f72c70e97d28d2b58c1e4e8bd94a4496ada9704b186b457409e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylons-sphinx-themes \
python39-pylons-sphinx-theme \
python39-pylons-sphinx-themes \
python39-pylons-theme-support \
python3dist-pylons-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python39-Pygments"

inherit rpm
