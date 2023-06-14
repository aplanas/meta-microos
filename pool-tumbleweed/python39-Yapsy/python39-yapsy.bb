SUMMARY = "Yet another plugin system"
DESCRIPTION = "Yapsy is a small library implementing the core mechanisms needed to \
build a plugin system into a wider application. \
 \
The main purpose is to depend only on Python's standard libraries (at \
least version 2.3) and to implement only the basic functionalities \
needed to detect, load and keep track of several plugins."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "python39-Yapsy-1.12.2-3.8.noarch.rpm"
RPM_HASH = "585f0482762525c78b03bc8d32536d72f0e534da31c7b3fa62c3871affe346ae8f542e77c227b75435236c13cbcd648849c4f99186e48a737a2d4b1e9ec0bac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yapsy \
python39-Yapsy \
python39-yapsy \
python3dist-yapsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
