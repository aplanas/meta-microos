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

RPM_NAME = "python39-pybcj-1.0.1-2.1.aarch64.rpm"
RPM_HASH = "bcf66097534f031ab9d2f5832f56248b7c2540a82a879486f4e3f7196121c89f20c0af30a26ecae1d78615efc082f881c01c429cf8f58a7752285f888e8a7e4d"

RPROVIDES:${PN} += "python3.9dist-pybcj \
python39-pybcj \
python3dist-pybcj"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
