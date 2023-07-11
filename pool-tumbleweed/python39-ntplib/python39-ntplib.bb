SUMMARY = "Python NTP library"
DESCRIPTION = "This module offers a simple interface to query NTP servers from Python. \
It also provides utility functions to translate NTP fields values to text \
(mode, leap indicator...). Since it's pure Python, and only depends on core \
modules, it should work on any platform with a decent Python implementation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-ntplib-0.4.0-1.5.noarch.rpm"
RPM_HASH = "23376d5745047419f068fcfc68f9fbc26cc579a6c5ff9b173fe5d3bf1518600dcca04990a2fc2fb88cf4649ca846bf88a12ebc26a686e6205f51a2ab23d1d671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ntplib \
python39-ntplib \
python3dist-ntplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
