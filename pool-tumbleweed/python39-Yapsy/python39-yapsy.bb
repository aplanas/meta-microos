SUMMARY = "Yet another plugin system"
DESCRIPTION = "Yapsy is a small library implementing the core mechanisms needed to \
build a plugin system into a wider application. \
 \
The main purpose is to depend only on Python's standard libraries (at \
least version 2.3) and to implement only the basic functionalities \
needed to detect, load and keep track of several plugins."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "python39-Yapsy-1.12.2-3.9.noarch.rpm"
RPM_HASH = "8cd92b19b2bad787034226208c7c13132011c3714bc67e3429b77bb95ed824d411b039b1969a8d98a86f4160159ffd93de6c07302e57f6cf59df08c96481fc28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yapsy \
python39-Yapsy \
python39-yapsy \
python3dist-yapsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
