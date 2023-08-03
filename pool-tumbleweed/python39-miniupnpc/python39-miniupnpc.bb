SUMMARY = "Universal Plug'n'Play (UPnP) Client Module for Python"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python39-miniupnpc-2.2.5-1.1.aarch64.rpm"
RPM_HASH = "6a5b711dc17510c7b64f676c9df969a7fbe306f8dd16292a09431ac72b5dd462227dad300dfc325aab6b3159f554b9e1315e5c7d2ed934e282756592d5f5f496"

RPROVIDES:${PN} += "python3.9dist-miniupnpc \
python39-miniupnpc \
python3dist-miniupnpc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libminiupnpc17 \
python-abi"

inherit rpm
