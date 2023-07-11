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

RPM_NAME = "python311-pybcj-1.0.1-2.1.aarch64.rpm"
RPM_HASH = "3f0c0671354db171a1b5a0cf9a054a1989dce0d4f55344ba54d19616678b7ad407204108638f9d8684620e684f66fe5af5ad7de65d910f8e650f8a9cebd2fa7d"

RPROVIDES:${PN} += "python3-pybcj \
python3.11dist-pybcj \
python311-pybcj \
python3dist-pybcj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
