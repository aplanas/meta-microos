SUMMARY = "Python binding for libfdt"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures. \
 \
Python binding part."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "python310-pylibfdt-1.6.1-1.10.aarch64.rpm"
RPM_HASH = "f468304c64fa052e348731e769fb7a41dc4c92ac8d9b6bc0fc125d1be4752e1fcc75c95f43971ee55a4d5c3f4d48393241b4839c91458b3d7f890fba5596fca4"

RPROVIDES:${PN} += "python3.10dist-pylibfdt \
python310-pylibfdt \
python3dist-pylibfdt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
