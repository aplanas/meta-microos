SUMMARY = "LLDB software debugger runtime library"
DESCRIPTION = "This subpackage contains the main LLDB component."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "16.0.6"

RPM_NAME = "liblldb16-16.0.6-1.1.aarch64.rpm"
RPM_HASH = "a1c2ebc7d3b4d6f29ad34f733ff269ec9863717e34b56efbdbc37ecc60617668b378538a21020d52388db7e02155714c4012fad00ef021701503c9b7d5c1ff73"

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
libpython3.11.so.1.0 \
libstdc++.so.6 \
libtinfo.so.6 \
libxml2.so.2 \
libz.so.1"

inherit rpm
