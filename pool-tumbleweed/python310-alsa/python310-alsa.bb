SUMMARY = "Python ALSA binding"
DESCRIPTION = "This package provides the Python binding to ALSA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.2.7"

RPM_NAME = "python310-alsa-1.2.7-2.6.aarch64.rpm"
RPM_HASH = "4d2e492b678b7560d53896952dedffc6f056236c2bc036429f272939c014b4ff736ae8164de470991aaaacc815d0a1b47d4beaaabfe88bbbbee1f5dfd120c8e8"

RPROVIDES:${PN} += "pyalsa \
python3.10dist-pyalsa \
python310-alsa \
python3dist-pyalsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
