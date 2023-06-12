SUMMARY = "Pylons Sphinx themes for documentation styling"
DESCRIPTION = "This repository is a Python package that contains Sphinx themes for Pylons \
related projects. This project is based on Pylons Sphinx Theme (singular), \
but uses a package implementation instead of git submodules and \
manual steps. \
 \
To use a theme in your Sphinx documentation, follow the guide in README.md."
LICENSE = "SUSE-Repoze"

PV = "1.0.13"

RPM_NAME = "python39-pylons-sphinx-themes-1.0.13-1.3.noarch.rpm"
RPM_HASH = "e8da4bc1946674352c1777033229daafeadab18f94058ac37d851fbff60132e9277babc4cb08482bd12725a59a7b00cbde8a85fd1612ee89cf08db635b58e053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pylons-sphinx-themes) \
python39-pylons-sphinx-themes \
python39-pylons_sphinx_theme \
python39-pylons_theme_support \
python3dist(pylons-sphinx-themes)"
RDEPENDS:${PN} += "python(abi) \
python39-Pygments"

inherit rpm
