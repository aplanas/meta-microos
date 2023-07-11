SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python311-pymediainfo-6.0.1-2.4.noarch.rpm"
RPM_HASH = "4916268b55b91bfa237dc10a703556637fa57fba40fc356eb3cc29ac5899559c56a908b7026111a14d914ddc3865f0430b29b040604699458037b64fde60d9de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pymediainfo \
python3.11dist-pymediainfo \
python311-pymediainfo \
python3dist-pymediainfo"

RDEPENDS:${PN} += "libmediainfo0 \
python-abi"

inherit rpm
