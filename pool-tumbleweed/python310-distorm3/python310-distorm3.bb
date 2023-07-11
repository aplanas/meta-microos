SUMMARY = "Disassembler Library For x86/AMD64"
DESCRIPTION = "diStorm3 is a decomposer, which means it takes an instruction and \
returns a binary structure which describes it rather than static \
text."
LICENSE = "BSD-3-Clause"

PV = "3.5.2"

RPM_NAME = "python310-distorm3-3.5.2-1.13.aarch64.rpm"
RPM_HASH = "ce90db92cdf157da20338940cf1ff58458e37276a773919e5c24687bdbd21f5b9312a3a8248d407fe8f49155186a7f6f8bc719e2cb07e4d4705cbf1283456952"

RPROVIDES:${PN} += "python3.10dist-distorm3 \
python310-distorm3 \
python3dist-distorm3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
