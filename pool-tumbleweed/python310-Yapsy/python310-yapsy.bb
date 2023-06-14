SUMMARY = "Yet another plugin system"
DESCRIPTION = "Yapsy is a small library implementing the core mechanisms needed to \
build a plugin system into a wider application. \
 \
The main purpose is to depend only on Python's standard libraries (at \
least version 2.3) and to implement only the basic functionalities \
needed to detect, load and keep track of several plugins."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "python310-Yapsy-1.12.2-3.8.noarch.rpm"
RPM_HASH = "f4dae812218b069f195b5229149e3aa6ed1aed0d222413f85d25f31db8c17c7b16b61073b762e52e228b82f80a2ef4a2d17fd20ed4579c8e6601e77426d819a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Yapsy \
python3-yapsy \
python3.10dist-yapsy \
python310-Yapsy \
python310-yapsy \
python3dist-yapsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
