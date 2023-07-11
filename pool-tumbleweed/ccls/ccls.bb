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

RPM_NAME = "ccls-0.20220729-2.2.aarch64.rpm"
RPM_HASH = "2c9a0588c1404fea6b87b6683e10c91f7d36e17f7fc59b8f0f346ea2fe41d35d30322e30c695eb34692c3f62736b129ccb8f9263c6dc0a068e09f3846a5eb556"

RPROVIDES:${PN} += "bundled-macro-map \
bundled-siphash \
ccls"

RDEPENDS:${PN} += "clang \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libclang-cpp16 \
libgcc-s.so.1 \
libstdc++.so.6 \
llvm"

inherit rpm
