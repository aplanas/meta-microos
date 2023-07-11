SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "lldb16-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "ff1de0503e278ce6e8134ca9752127edb2983c44fe9d3aa9ff982d3dba68ad1e507d4a15fbba91714b213e60ca1b5f753a8549934c8ba3870db423d730cf9661"

RPROVIDES:${PN} += "lldb16"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libgcc-s.so.1 \
liblldb.so.16 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
