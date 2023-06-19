SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "liblldb16-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "fd4b67eba0e19a69e70eee959252ff583d6367a26bca1626679402f4054653bed457055bf00f13f8b94b34f0a113a2b99b8a169d7d048d3d9d0d83ff7c58a880"

RPROVIDES:${PN} += "liblldb.so.16 \
liblldb16 \
liblldbIntelFeatures.so.16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libedit.so.0 \
libgcc-s.so.1 \
liblzma.so.5 \
libm.so.6 \
libncurses.so.6 \
libpanel.so.6 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
