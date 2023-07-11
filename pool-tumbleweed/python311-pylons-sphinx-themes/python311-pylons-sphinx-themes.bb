SUMMARY = "Pylons Sphinx themes for documentation styling"
DESCRIPTION = "This repository is a Python package that contains Sphinx themes for Pylons \
related projects. This project is based on Pylons Sphinx Theme (singular), \
but uses a package implementation instead of git submodules and \
manual steps. \
 \
To use a theme in your Sphinx documentation, follow the guide in README.md."
LICENSE = "SUSE-Repoze"

PV = "1.0.13"

RPM_NAME = "python311-pylons-sphinx-themes-1.0.13-2.2.noarch.rpm"
RPM_HASH = "8136827cd9bf8103e5280dc1913e7ab2e7fd4b1a9ef67acd72c0786699b835151d817800c24805615bbe49afd3ebf75c122fc10ed511a71453be3c46c533263d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylons-sphinx-theme \
python3-pylons-sphinx-themes \
python3-pylons-theme-support \
python3.11dist-pylons-sphinx-themes \
python311-pylons-sphinx-theme \
python311-pylons-sphinx-themes \
python311-pylons-theme-support \
python3dist-pylons-sphinx-themes"

RDEPENDS:${PN} += "python-abi \
python311-Pygments"

inherit rpm
