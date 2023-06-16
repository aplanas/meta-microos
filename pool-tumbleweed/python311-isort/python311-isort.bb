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

RPM_NAME = "python311-isort-5.12.0-2.1.noarch.rpm"
RPM_HASH = "4552696c60ef6ffbca5f83e12782cb63a9b26f2c39ebac8563a871fe59ac304b1bca9c6e57c1cd3eb17ddc6d57fa1a33a92078a6517d1ad5ba97971ec1119874"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-isort \
python311-isort \
python3dist-isort"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
