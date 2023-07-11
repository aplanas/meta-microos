SUMMARY = "A bcj filter library"
DESCRIPTION = "In data compression, BCJ, short for Branch-Call-Jump, refers to a technique that \
improves the compression of machine code of executable binaries by replacing \
relative branch addresses with absolute ones. This allows a LZMA compressor to \
identify duplicate targets and archive higher compression rate. \
 \
BCJ is used in 7-zip compression utility as default filter for executable binaries. \
 \
pybcj is a python bindings with BCJ implementation by C language. The C codes are \
derived from p7zip, portable 7-zip implementation. pybcj support Intel/Amd \
x86/x86_64, Arm/Arm64, ArmThumb, Sparc, PPC, and IA64."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.1"

RPM_NAME = "python310-pybcj-1.0.1-2.1.aarch64.rpm"
RPM_HASH = "781390662ce42a0ffb365caa35a1128d9f6dd05f9c0b3a5dd8a7f9a039b319137565ba2ebaf5efdd608b1063a3c2f2f2c42b0c73ad5a60bc1b74e514f8926e53"

RPROVIDES:${PN} += "python3.10dist-pybcj \
python310-pybcj \
python3dist-pybcj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
