SUMMARY = "Evented I/O for V8 JavaScript"
DESCRIPTION = "Node.js is a JavaScript runtime built on Chrome's V8 JavaScript engine. Node.js \
uses an event-driven, non-blocking I/O model. Node.js has a package ecosystem \
provided by npm."
LICENSE = "MIT"

PV = "20.2.0"

RPM_NAME = "nodejs20-20.2.0-2.1.aarch64.rpm"
RPM_HASH = "31a872da2c7617bc3d355456f1d11b5e4200080a9b616ee17c72d6654c03368c3e37a7c62c7a8b943fcc81c5cfab5cfbbfc1927e5438493de4b76e29d8eab96d"

RPROVIDES:${PN} += "bundled(ada) \
bundled(base64) \
bundled(libuv) \
bundled(llhttp) \
bundled(ngtcp2) \
bundled(node-acorn) \
bundled(node-acorn-walk) \
bundled(node-balanced-match) \
bundled(node-brace-expansion) \
bundled(node-busboy) \
bundled(node-cjs-module-lexer) \
bundled(node-corepack) \
bundled(node-minimatch) \
bundled(node-streamsearch) \
bundled(node-undici) \
bundled(simdutf) \
bundled(uvwasi) \
bundled(v8) \
nodejs \
nodejs(abi) \
nodejs(engine) \
nodejs20 \
nodejs20(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/update-alternatives \
ld-linux-aarch64.so.1()(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libc.so.6()(64bit) \
libcares.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libnghttp2.so.14()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit) \
nodejs-common"

inherit rpm
