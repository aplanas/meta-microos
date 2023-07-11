SUMMARY = "Python binding for libfdt"
DESCRIPTION = "libfdt is a library to process Open Firmware style device trees on various \
architectures. \
 \
Python binding part."
LICENSE = "BSD-2-Clause & GPL-2.0-only"

PV = "1.6.1"

RPM_NAME = "python311-pylibfdt-1.6.1-1.10.aarch64.rpm"
RPM_HASH = "bc1239e095a8013662e8cb01515ee4454194c536179eb1009b84b98369576679eb27c0690a693a097fadd553abfbb0ed4d70ccc52c3d124b4a2e3a76134cb26b"

RPROVIDES:${PN} += "python3-pylibfdt \
python3.11dist-pylibfdt \
python311-pylibfdt \
python3dist-pylibfdt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
