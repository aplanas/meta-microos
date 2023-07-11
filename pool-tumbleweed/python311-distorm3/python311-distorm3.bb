SUMMARY = "Disassembler Library For x86/AMD64"
DESCRIPTION = "diStorm3 is a decomposer, which means it takes an instruction and \
returns a binary structure which describes it rather than static \
text."
LICENSE = "BSD-3-Clause"

PV = "3.5.2"

RPM_NAME = "python311-distorm3-3.5.2-1.13.aarch64.rpm"
RPM_HASH = "7f6c540261a07c3448fb8a4b9b2d0b09409a68c241e41f122dfa47b60ccb88d2e327caeb9887a2de33aed9ec1fa28ef58a66724e37622212ae1516c213986ea8"

RPROVIDES:${PN} += "python3-distorm3 \
python3.11dist-distorm3 \
python311-distorm3 \
python3dist-distorm3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
