SUMMARY = "USB access on the Python language"
DESCRIPTION = "Provides USB access to the Python language."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python310-pyusb-1.2.1-1.8.noarch.rpm"
RPM_HASH = "a78afe2c5d2cdf79e90c02cc12f8732bc8e1023dacecb31261e7adffbfc5be1dca11a10d6223155c96427ffd7aaee38b011701bb148ce6eb8798580eab63d522"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyusb \
python3-usb \
python3.10dist-pyusb \
python310-pyusb \
python310-usb \
python3dist-pyusb"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm
