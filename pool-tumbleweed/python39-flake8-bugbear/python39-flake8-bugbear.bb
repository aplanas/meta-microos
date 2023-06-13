SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.5.9"

RPM_NAME = "python39-flake8-bugbear-23.5.9-1.1.noarch.rpm"
RPM_HASH = "2df4f09bc29938a8951f11fa179a09f96ae31e72c6f0f45937fcbcf13d2e5bdd93061fc4901227704f9d64e6d1a33188a82644d343e480895c69720e29059d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-bugbear) \
python39-flake8-bugbear \
python3dist(flake8-bugbear)"

RDEPENDS:${PN} += "python(abi) \
python39-attrs \
python39-flake8"

inherit rpm
