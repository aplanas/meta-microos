SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "python310-miniupnpc-2.2.4-1.6.aarch64.rpm"
RPM_HASH = "69825ee993622b43cd79d5fa4c8c5512be58753f343ac888e392198b28bbf7a21b6c8f84c78f36edf763384553ee4bba27baae542cb5f685b10e83f4d24cfcc8"

RPROVIDES:${PN} += "python3.10dist-miniupnpc \
python310-miniupnpc \
python3dist-miniupnpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc17 \
python-abi"

inherit rpm
