SUMMARY = "Disassembler Library For x86/AMD64"
DESCRIPTION = "diStorm3 is a decomposer, which means it takes an instruction and \
returns a binary structure which describes it rather than static \
text."
LICENSE = "BSD-3-Clause"

PV = "3.5.2"

RPM_NAME = "python310-distorm3-3.5.2-1.11.aarch64.rpm"
RPM_HASH = "18af092bb957bfcb9f38025d387df16c6ee01fc5fab5694c2502be0c53b1e428c8b4ec317222dd35929d4c603eed548cfe1fabc5674b88fa90a4a008ccd7dd49"

RPROVIDES:${PN} += "python3-distorm3 \
python3.10dist(distorm3) \
python310-distorm3 \
python310-distorm3(aarch-64) \
python3dist(distorm3)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
