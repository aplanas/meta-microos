SUMMARY = "Python NTP library"
DESCRIPTION = "This module offers a simple interface to query NTP servers from Python. \
It also provides utility functions to translate NTP fields values to text \
(mode, leap indicator...). Since it's pure Python, and only depends on core \
modules, it should work on any platform with a decent Python implementation."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python310-ntplib-0.4.0-1.5.noarch.rpm"
RPM_HASH = "62eb60191cba82d045fb01dcd4d942950d9ef48e4f7c22071ae8423218e7ce7d208c4ea0e443f97a6c6d244a19b58157368dffc3b20f987def102116c89784b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ntplib \
python310-ntplib \
python3dist-ntplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
