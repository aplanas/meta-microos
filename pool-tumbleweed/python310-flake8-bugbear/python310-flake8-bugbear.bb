SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.7.10"

RPM_NAME = "python310-flake8-bugbear-23.7.10-1.1.noarch.rpm"
RPM_HASH = "f29320fe35fdf5685cb0106ddf841d8d4140765308543f00066df60cddfaa52eb63fb93b02c889ec2def5798e05aee73621bc2b4b053397096891bcc131fc2ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flake8-bugbear \
python310-flake8-bugbear \
python3dist-flake8-bugbear"

RDEPENDS:${PN} += "python-abi \
python310-attrs \
python310-flake8"

inherit rpm
