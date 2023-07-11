SUMMARY = "A Python interface to the SANE scanner and frame grabber interface"
DESCRIPTION = "The SANE module provides an interface to the SANE scanner and frame grabber interface for Linux.  This module has been split out from Pillow since version 2.7.0."
LICENSE = "NTP"

PV = "2.9.1"

RPM_NAME = "python39-sane-2.9.1-1.13.aarch64.rpm"
RPM_HASH = "30d98689ae657195084d1203abf95e88282ce0a1f384fd738ebb6116aee47ed4c9815a3d7994d7bd902ddabb649faa8c4c4eeb4d1967143e534567b25e86ade4"

RPROVIDES:${PN} += "python3.9dist-python-sane \
python39-sane \
python3dist-python-sane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
python-abi"

inherit rpm
