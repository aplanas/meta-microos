SUMMARY = "Python binding for libfdt"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures. \
 \
Python binding part."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "python39-pylibfdt-1.6.1-1.10.aarch64.rpm"
RPM_HASH = "ee77edc43f06718a4292e1051ca697a4cb9a22e7041c4301d845a70c435bdb70eb0d06223a9ec31bd6a6889a8e06c09bce808cce526668aa3c94dce351b07923"

RPROVIDES:${PN} += "python3.9dist-pylibfdt \
python39-pylibfdt \
python3dist-pylibfdt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
