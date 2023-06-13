SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "liblldb16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "fd4b67eba0e19a69e70eee959252ff583d6367a26bca1626679402f4054653bed457055bf00f13f8b94b34f0a113a2b99b8a169d7d048d3d9d0d83ff7c58a880"

RPROVIDES:${PN} += "liblldb.so.16()(64bit) \
liblldb.so.16(LLVM_16)(64bit) \
liblldb16 \
liblldb16(aarch-64) \
liblldbIntelFeatures.so.16()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.16()(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libncurses.so.6()(64bit) \
libpanel.so.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
