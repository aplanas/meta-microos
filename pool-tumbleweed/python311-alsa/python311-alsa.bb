SUMMARY = "Python ALSA binding"
DESCRIPTION = "This package provides the Python binding to ALSA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.2.7"

RPM_NAME = "python311-alsa-1.2.7-2.6.aarch64.rpm"
RPM_HASH = "def29f0bde2c9e075280d0fcd0aeafc784f12b251a832e307c29ac2d6c5dff1e55f0f5a7f04f8acaa4fe16e2ec1d95218c9eed6b3bbe2d5f295f32227a7703a6"

RPROVIDES:${PN} += "pyalsa \
python3-alsa \
python3.11dist-pyalsa \
python311-alsa \
python3dist-pyalsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
