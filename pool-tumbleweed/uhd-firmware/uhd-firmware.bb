SUMMARY = "Firmware images for uhd"
DESCRIPTION = "This package contains binary firmware images for the Universal Hardware Driver (UHD)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "uhd-firmware-4.4.0.0-1.5.noarch.rpm"
RPM_HASH = "98b74141c7e60a22e6962b4801cd6e3fd09b163828c44b1f47a0ce9e8c8eb1ea27760687172212b48c8581a80c6b6f6646375dfee9fc4bc7ca662868c228a124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uhd-firmware"

RDEPENDS:${PN} += "libuhd4-4-0"

inherit rpm
