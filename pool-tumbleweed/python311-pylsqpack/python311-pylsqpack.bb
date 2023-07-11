SUMMARY = "Python ls-qpack QPACK library"
DESCRIPTION = "Python wrapper for the ls-qpack QPACK library."
LICENSE = "BSD-3-Clause"

PV = "0.3.16"

RPM_NAME = "python311-pylsqpack-0.3.16-2.1.aarch64.rpm"
RPM_HASH = "6739e123d26832eed8a58127b6459098c061d51a1eaba8dee43f17a361eeb4e3d34c61cf06285bd129621e1bc0201f87279a44128982a41bc4a295a15fcb71cc"

RPROVIDES:${PN} += "python3-pylsqpack \
python3.11dist-pylsqpack \
python311-pylsqpack \
python3dist-pylsqpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
