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

RPM_NAME = "python39-isort-5.12.0-2.3.noarch.rpm"
RPM_HASH = "1ef20fdd67b08e0828764a4de7963668e0f5cf773bb28d13c8e1f092cb3c9d187652a3af45b72163ae9c52269a27393c5d23d0fcbb7965e7ba5fe908b3a34abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-isort \
python39-isort \
python3dist-isort"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
