SUMMARY = "A plugin for flake8 finding likely bugs and design problems in your program"
DESCRIPTION = "A plugin for Flake8 finding likely bugs and design problems in your \
program.  Contains warnings that don't belong in pyflakes and \
pycodestyle."
LICENSE = "MIT"

PV = "23.7.10"

RPM_NAME = "python39-flake8-bugbear-23.7.10-1.1.noarch.rpm"
RPM_HASH = "2906c243e2f70e65b6b767a7a43488ae2152e9a9c18e2049297f31ccfa17c5d7e79af217faf3f3d86040fae79568498b3e2321b38025e3e13e26f56db31834ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8-bugbear \
python39-flake8-bugbear \
python3dist-flake8-bugbear"

RDEPENDS:${PN} += "python-abi \
python39-attrs \
python39-flake8"

inherit rpm
