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

RPM_NAME = "python310-isort-5.12.0-2.3.noarch.rpm"
RPM_HASH = "799e51a25776c79d4857c5318f91d3487101608b5e2decdab1e13230f626565a2c2eab2ea8257f434c8cfa8878a5b4c6752059fed5b5cae7b21bfe59d9d772da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-isort \
python310-isort \
python3dist-isort"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
