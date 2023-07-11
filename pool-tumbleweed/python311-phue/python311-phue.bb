SUMMARY = "Philips Hue Python library"
DESCRIPTION = "Full featured Python library to control the Philips Hue lighting system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python311-phue-1.1-2.8.noarch.rpm"
RPM_HASH = "c9e954fdf2dfd8fba3cc0cde92e4f7e8299f521bfac998c3b989c5d47639e7e25b027a6ec105e59075a6fe5c375b81d039177aa5136edd6d127697aa0a639b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-phue \
python3.11dist-phue \
python311-phue \
python3dist-phue"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi"

inherit rpm
