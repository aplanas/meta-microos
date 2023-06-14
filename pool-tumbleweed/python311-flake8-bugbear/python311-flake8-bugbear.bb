SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.5.9"

RPM_NAME = "python311-flake8-bugbear-23.5.9-1.1.noarch.rpm"
RPM_HASH = "a68e323600240e234b1d0f7f2ccddfde5477a1d9e3ffeccfa3d7cae7ca0ed746a1f7356ec35f17a3c7e1159225e7abb9ea68c8429fa63ca3e335d264a8d803c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-flake8-bugbear \
python311-flake8-bugbear \
python3dist-flake8-bugbear"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-flake8"

inherit rpm
