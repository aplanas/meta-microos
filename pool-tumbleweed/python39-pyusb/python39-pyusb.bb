SUMMARY = "USB access on the Python language"
DESCRIPTION = "Provides USB access to the Python language."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python39-pyusb-1.2.1-1.8.noarch.rpm"
RPM_HASH = "080903a7e9a2412fe146d4c4b24b72c0a34601eb3fef7b2e442f0f89b07621739b50ae6a9bbd8763928dc230d49bf76ab1c975a171e6c14be266e7bce75b9592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyusb \
python39-pyusb \
python39-usb \
python3dist-pyusb"

RDEPENDS:${PN} += "libusb-1-0-0 \
python-abi"

inherit rpm
