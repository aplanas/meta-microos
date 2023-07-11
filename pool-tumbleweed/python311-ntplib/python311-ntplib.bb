SUMMARY = "Python NTP library"
DESCRIPTION = "This module offers a simple interface to query NTP servers from Python. \
It also provides utility functions to translate NTP fields values to text \
(mode, leap indicator...). Since it's pure Python, and only depends on core \
modules, it should work on any platform with a decent Python implementation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-ntplib-0.4.0-1.5.noarch.rpm"
RPM_HASH = "20dc2bd35963e16f293c8d93d2cb5acc8eb3ac3b1927f1a74ef878a2b9caf739a2477d56e0778f51e5045de5385fb9dd8804b97554740596b0d570a3e4d92f49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ntplib \
python3.11dist-ntplib \
python311-ntplib \
python3dist-ntplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
