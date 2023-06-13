SUMMARY = "C/C++/ObjC language server"
DESCRIPTION = "ccls, which originates from cquery, is a C/C++/Objective-C language server. \
 \
- code completion (with both signature help and snippets) \
- definition/references, and other cross references \
- cross reference extensions: $ccls/call $ccls/inheritance $ccls/member \
  $ccls/vars ... \
- formatting \
- hierarchies: call (caller/callee) hierarchy, inheritance (base/derived) \
  hierarchy, member hierarchy \
- symbol rename \
- document symbols and approximate search of workspace symbol \
- hover information \
- diagnostics and code actions (clang FixIts) \
- semantic highlighting and preprocessor skipped regions \
- semantic navigation: $ccls/navigate"
LICENSE = "Apache-2.0 & CC0-1.0 & BSL-1.0"

PV = "0.20220729"

RPM_NAME = "ccls-0.20220729-2.1.aarch64.rpm"
RPM_HASH = "63a158a555a57d4690c0d77fe4fafe77b481d7579c1cd67ac12ddc3fe4c3e680d1809a638a7e44c9ed547512612b90d5926a531f2a773c831ba24115467252be"

RPROVIDES:${PN} += "bundled(macro_map) \
bundled(siphash) \
ccls \
ccls(aarch-64)"

RDEPENDS:${PN} += "clang \
ld-linux-aarch64.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libc.so.6()(64bit) \
libclang-cpp.so.16()(64bit) \
libclang-cpp16 \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
llvm"

inherit rpm
