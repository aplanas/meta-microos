SUMMARY = "Super-parallel Python port of the C-Reduce"
DESCRIPTION = " \
C-Vise is a super-parallel Python port of the C-Reduce. The port is fully \
compatible to the C-Reduce and uses the same efficient \
LLVM-based C/C++ reduction tool named clang_delta. \
 \
C-Vise is a tool that takes a large C, C++ or OpenCL program that \
has a property of interest (such as triggering a compiler bug) and \
automatically produces a much smaller C/C++ or OpenCL program that \
has the same property. It is intended for use by people who discover \
and report bugs in compilers and other tools that process C/C++ or OpenCL code."
LICENSE = "BSD-3-Clause"

PV = "2.8.0+git.20230428.7aaa251"

RPM_NAME = "cvise-2.8.0+git.20230428.7aaa251-1.2.aarch64.rpm"
RPM_HASH = "ecd026bcfa5bac350213164d94ceb674e6dbab4bfc762f7b075a6ce1cbfd03ecf831e3238ecd6988e7321ad8d1f50967c1923a89d9dc55624f711e57c0b10662"

RPROVIDES:${PN} += "cvise"

RDEPENDS:${PN} += "/usr/bin/env \
astyle \
clang \
colordiff \
indent \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
llvm \
python3-Pebble \
python3-chardet \
python3-psutil \
unifdef"

inherit rpm
