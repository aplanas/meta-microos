SUMMARY = "A Python interface to the SANE scanner and frame grabber interface"
DESCRIPTION = "The SANE module provides an interface to the SANE scanner and frame grabber interface for Linux.  This module has been split out from Pillow since version 2.7.0."
LICENSE = "NTP"

PV = "2.9.1"

RPM_NAME = "python311-sane-2.9.1-1.13.aarch64.rpm"
RPM_HASH = "495924a4f8bf203e49deff158f2a044046645786b6e61994d7f2522f8c8b1a1d3efa3c15a5dbf296e181de97832cc243c7e175df13eff28ddf0b2694418aa3b6"

RPROVIDES:${PN} += "python3-sane \
python3.11dist-python-sane \
python311-sane \
python3dist-python-sane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
python-abi"

inherit rpm
