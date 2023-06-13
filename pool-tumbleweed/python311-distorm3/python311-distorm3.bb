SUMMARY = "Disassembler Library For x86/AMD64"
DESCRIPTION = "diStorm3 is a decomposer, which means it takes an instruction and \
returns a binary structure which describes it rather than static \
text."
LICENSE = "BSD-3-Clause"

PV = "3.5.2"

RPM_NAME = "python311-distorm3-3.5.2-1.11.aarch64.rpm"
RPM_HASH = "dd095f9ac5484caa035966283c2961bb4cd8b4f5566a5b722e897f28a62f5b0acf08837adad306ee3af5690be183826ae1e8f03ea8079b0284478304e32f987f"

RPROVIDES:${PN} += "python3.11dist(distorm3) \
python311-distorm3 \
python311-distorm3(aarch-64) \
python3dist(distorm3)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
