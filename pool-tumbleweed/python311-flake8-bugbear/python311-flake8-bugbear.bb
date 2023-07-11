SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.6.5"

RPM_NAME = "python311-flake8-bugbear-23.6.5-1.3.noarch.rpm"
RPM_HASH = "8eb0f791b346ea847ea0c017dd3bb4ad08525eb386d310ac4e3edca7910bdec148123e9a1817d14c2d85b0cfe5c77aa4c21c5b0930576b80c276e02ff580a6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flake8-bugbear \
python3.11dist-flake8-bugbear \
python311-flake8-bugbear \
python3dist-flake8-bugbear"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-flake8"

inherit rpm
