SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python310-pick-2.2.0-2.3.noarch.rpm"
RPM_HASH = "f4f34dc48b83b71ffe7c5ffdc6d8b55d0d8d47c26c11410cc3dbc5cdb0024f79001e019dbee58e588b3580a33a4294f3fc09afabd1072335fd7fd2e8ce203071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pick \
python310-pick \
python3dist-pick"

RDEPENDS:${PN} += "python-abi"

inherit rpm
