SUMMARY = "Yet another plugin system"
DESCRIPTION = "Yapsy is a small library implementing the core mechanisms needed to \
build a plugin system into a wider application. \
 \
The main purpose is to depend only on Python's standard libraries (at \
least version 2.3) and to implement only the basic functionalities \
needed to detect, load and keep track of several plugins."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "python311-Yapsy-1.12.2-3.9.noarch.rpm"
RPM_HASH = "cb5fe82e80548ed0b12b51fe7d68c57e9e4b8c8abe469e391904c0a897dd1624fea1943e9f14e762063fea5619d3ce3193096109729037d5785750c75ce3d231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Yapsy \
python3-yapsy \
python3.11dist-yapsy \
python311-Yapsy \
python311-yapsy \
python3dist-yapsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
