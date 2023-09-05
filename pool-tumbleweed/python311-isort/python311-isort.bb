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

RPM_NAME = "python311-isort-5.12.0-3.1.noarch.rpm"
RPM_HASH = "7f431b083a94656eba45ceef99342486452b06fcda1950f62c403c59c4b9dc7078bcc5b65ace988e9a747bd5ee852e76a2511b22455105d83707032f22a7097e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isort \
python3.11dist-isort \
python311-isort \
python3dist-isort"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
