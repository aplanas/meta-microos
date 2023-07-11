SUMMARY = "Python ALSA binding"
DESCRIPTION = "This package provides the Python binding to ALSA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.2.7"

RPM_NAME = "python39-alsa-1.2.7-2.6.aarch64.rpm"
RPM_HASH = "690547e2e6471fa81877799030c2f0701c705685b8d5c2e9a3c2bab98d4ea8f9588f053c52f450b9154df49a4a7bb8ec3c9500c0eaf4690c0319f11243195cda"

RPROVIDES:${PN} += "pyalsa \
python3.9dist-pyalsa \
python39-alsa \
python3dist-pyalsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
