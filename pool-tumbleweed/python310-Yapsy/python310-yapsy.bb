SUMMARY = "Yet another plugin system"
DESCRIPTION = "Yapsy is a small library implementing the core mechanisms needed to \
build a plugin system into a wider application. \
 \
The main purpose is to depend only on Python's standard libraries (at \
least version 2.3) and to implement only the basic functionalities \
needed to detect, load and keep track of several plugins."
LICENSE = "BSD-2-Clause"

PV = "1.12.2"

RPM_NAME = "python310-Yapsy-1.12.2-3.9.noarch.rpm"
RPM_HASH = "75a090a79b0ac15af627240afae1299f4b88be3a82e7e43b6319d8f63652f349517ab7bbeeb79739886622504aee77532a56b48bd2959ad10df29503630dfba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yapsy \
python310-Yapsy \
python310-yapsy \
python3dist-yapsy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
