SUMMARY = "Pylons Sphinx themes for documentation styling"
DESCRIPTION = "This repository is a Python package that contains Sphinx themes for Pylons \
related projects. This project is based on Pylons Sphinx Theme (singular), \
but uses a package implementation instead of git submodules and \
manual steps. \
 \
To use a theme in your Sphinx documentation, follow the guide in README.md."
LICENSE = "SUSE-Repoze"

PV = "1.0.13"

RPM_NAME = "python310-pylons-sphinx-themes-1.0.13-1.3.noarch.rpm"
RPM_HASH = "c773186ef9a34d648e086320f8d619b1e1d3c15eeefc62b134ab46fd19a571d4f4535d161762c1c44d2faa238e3eb445a0bcf0b31f8333a43af34f05a65a2c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylons-sphinx-themes \
python3-pylons_sphinx_theme \
python3-pylons_theme_support \
python3.10dist(pylons-sphinx-themes) \
python310-pylons-sphinx-themes \
python310-pylons_sphinx_theme \
python310-pylons_theme_support \
python3dist(pylons-sphinx-themes)"

RDEPENDS:${PN} += "python(abi) \
python310-Pygments"

inherit rpm
