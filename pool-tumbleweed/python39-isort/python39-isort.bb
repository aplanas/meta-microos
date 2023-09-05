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

RPM_NAME = "python39-isort-5.12.0-3.1.noarch.rpm"
RPM_HASH = "17bee256bce3792e7c9860262ebd03cb8f95f22dc62a96da68a257c9f904b5f784abc0847f0cbf8096bfff77553847f4ee58cd224dbb81af16d552140a9026a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-isort \
python39-isort \
python3dist-isort"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
