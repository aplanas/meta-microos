SUMMARY = "USB access on the Python language"
DESCRIPTION = "Provides USB access to the Python language."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-pyusb-1.2.1-1.10.noarch.rpm"
RPM_HASH = "b441b9dc4ee7e3fe4d158bd880dea11b51b67d2326040a67f4882f3e67151f65af234c9a802e14bdc22142c6a0aba53c55ba5a2bcbb777bbaede014cda9e86f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyusb \
python3-usb \
python3.11dist-pyusb \
python311-pyusb \
python311-usb \
python3dist-pyusb"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm
