SUMMARY = "A Python interface to the SANE scanner and frame grabber interface"
DESCRIPTION = "The SANE module provides an interface to the SANE scanner and frame grabber interface for Linux.  This module has been split out from Pillow since version 2.7.0."
LICENSE = "NTP"

PV = "2.9.1"

RPM_NAME = "python310-sane-2.9.1-1.11.aarch64.rpm"
RPM_HASH = "304d4e43c22ebbfd8d618c2affbb8a704719fcdcda751bf536dea09a624ab7fe4595d7d30bde0af0a48468028b6983e4c66bd82cb9af16aae13fc0bb3d16fcc6"

RPROVIDES:${PN} += "python3-sane \
python3.10dist-python-sane \
python310-sane \
python3dist-python-sane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
python-abi"

inherit rpm
