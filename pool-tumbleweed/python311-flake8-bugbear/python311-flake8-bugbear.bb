SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.7.10"

RPM_NAME = "python311-flake8-bugbear-23.7.10-1.1.noarch.rpm"
RPM_HASH = "8a2347053908cceb8bf564132c04c831bbcd072afbf5ce34c573136d94fe19c5d25c2031b618394ece277278fe027765eeab1cba865b5c7c58e3dde49c804894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-bugbear \
python3.11dist-flake8-bugbear \
python311-flake8-bugbear \
python3dist-flake8-bugbear"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-flake8"

inherit rpm
