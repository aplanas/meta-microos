SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python311-pymediainfo-6.0.1-3.1.noarch.rpm"
RPM_HASH = "2da7ea7bb744f801c42d7c9dd844fd5916d8ae33081410eed4335abcfb02430e86bb6e53fe5fec35b7eca7db2e2ed7722098bf1e6bc02ed6e8336a168645eedc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymediainfo \
python3.11dist-pymediainfo \
python311-pymediainfo \
python3dist-pymediainfo"

RDEPENDS:${PN} += "libmediainfo0 \
python-abi"

inherit rpm
