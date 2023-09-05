SUMMARY = "A Python utility / library to sort Python imports"
DESCRIPTION = "isort your python imports for you so you don't have to. \
 \
isort is a Python utility / library to sort imports alphabetically, and \
automatically separated into sections and by type. It provides a command line \
utility, Python library and plugins for various editors to quickly sort all your \
imports. It requires Python 3.8+ to run but supports formatting Python 2 code \
too."
LICENSE = "MIT"

PV = "5.12.0"

RPM_NAME = "python310-isort-5.12.0-3.1.noarch.rpm"
RPM_HASH = "b0c18253cc0b23d0ab457877fb5708b9356e73ca22657e6d7f980d2df97e16aefcc1e00b13b845f81f122d982b0fe1d7d38048b6971909ebb3d2d1f9b9df0644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-isort \
python310-isort \
python3dist-isort"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
