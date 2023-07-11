SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.6.5"

RPM_NAME = "python39-flake8-bugbear-23.6.5-1.3.noarch.rpm"
RPM_HASH = "18131876e974e119770e76b027e344c42ca041359706ca865d13b532bec7943e1f4c723ca407c50bdf029543f95b776bf8ce9dc46db274f2f5f9e3935a2f22bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-bugbear \
python39-flake8-bugbear \
python3dist-flake8-bugbear"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-flake8"

inherit rpm
