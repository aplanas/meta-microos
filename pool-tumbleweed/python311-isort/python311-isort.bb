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

RPM_NAME = "python311-isort-5.12.0-2.3.noarch.rpm"
RPM_HASH = "c44a7ca123ddf0545873ad38e68a5ab0a90ed8022c9ff2159aed2c1776552612db50d68f8f6336cb2884c411bc5865704af8337f286dcf27a9ac38eac4438ab1"
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
