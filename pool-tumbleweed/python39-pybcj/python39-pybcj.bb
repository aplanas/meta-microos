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

RPM_NAME = "python39-pybcj-1.0.1-1.5.aarch64.rpm"
RPM_HASH = "f9ff3307156291010ca54678335772fe000cbbc780cb6050cf157b013f736234732e17ef93b251e2787c07ca2186ff7b707fc73f0a3e9c360e61dd4d15213b35"

RPROVIDES:${PN} += "python3.9dist(pybcj) \
python39-pybcj \
python39-pybcj(aarch-64) \
python3dist(pybcj)"

RDEPENDS:${PN} += "(python39-importlib_metadata if python39-base < 3.8) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
