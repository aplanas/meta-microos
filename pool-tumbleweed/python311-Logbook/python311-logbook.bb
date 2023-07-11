SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python311-Logbook-1.5.3-4.1.aarch64.rpm"
RPM_HASH = "033dd93abc48cac6154a8579ae391e74f4ea58a8cd3dfe653a9ac09c5e39840e3145e1c5febaa9ab51ecf4cfac4253c0388f5cef18dd6d041cb6989feb713811"

RPROVIDES:${PN} += "python3-Logbook \
python3.11dist-logbook \
python311-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
