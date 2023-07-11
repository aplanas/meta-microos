SUMMARY = "Disassembler Library For x86/AMD64"
DESCRIPTION = "diStorm3 is a decomposer, which means it takes an instruction and \
returns a binary structure which describes it rather than static \
text."
LICENSE = "BSD-3-Clause"

PV = "3.5.2"

RPM_NAME = "python39-distorm3-3.5.2-1.13.aarch64.rpm"
RPM_HASH = "2211aec8d7aef4660fcbcb526234d39f44c93bc550a0acb3272d7c81ac9b8a0aad7003e9ab5d22149aa9e8e4c4626233c5d9987eab57a19a7ed6b7195d0e1e5d"

RPROVIDES:${PN} += "python3.9dist-distorm3 \
python39-distorm3 \
python3dist-distorm3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
