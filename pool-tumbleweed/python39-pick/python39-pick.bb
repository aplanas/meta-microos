SUMMARY = "Curses-based interactive selection list module"
DESCRIPTION = "pick is a Python library to help create curses-based \
interactive selection list in the terminal."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python39-pick-2.2.0-2.3.noarch.rpm"
RPM_HASH = "45ff57844987fe089780714b034d9adc7bf6087705db690ce6f121460b051b332aa198dacf2a033794ceee8c92715cfbfdc55372836a271cf44d5a41425db9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pick \
python39-pick \
python3dist-pick"

RDEPENDS:${PN} += "python-abi"

inherit rpm
