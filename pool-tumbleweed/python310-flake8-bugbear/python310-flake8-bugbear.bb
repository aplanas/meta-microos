SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.6.5"

RPM_NAME = "python310-flake8-bugbear-23.6.5-1.3.noarch.rpm"
RPM_HASH = "1a4c821baed1cddefe65a549257e2ac48769b5232a33fe5130fd23d49b44e0174adff592b3560668c4a035f86adf4422e2bd826543a3bc5f5c9f55e9d0d51c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-bugbear \
python310-flake8-bugbear \
python3dist-flake8-bugbear"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-flake8"

inherit rpm
