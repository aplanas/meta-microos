SUMMARY = "Evented I/O for V8 JavaScript"
DESCRIPTION = "Node.js is a JavaScript runtime built on Chrome's V8 JavaScript engine. Node.js \
uses an event-driven, non-blocking I/O model. Node.js has a package ecosystem \
provided by npm."
LICENSE = "MIT"

PV = "20.5.1"

RPM_NAME = "nodejs20-20.5.1-2.1.aarch64.rpm"
RPM_HASH = "38d18174e16067551e55d22da2b013f2e56e61c6bf6eae5ac7cc5be2c6dc9e8fcca05fe1141998390cdb91c7b8b374500402d7c746ebbc0cbed8346e2a7438eb"

RPROVIDES:${PN} += "bundled-ada \
bundled-base64 \
bundled-libuv \
bundled-llhttp \
bundled-ngtcp2 \
bundled-node-acorn \
bundled-node-acorn-walk \
bundled-node-balanced-match \
bundled-node-brace-expansion \
bundled-node-busboy \
bundled-node-cjs-module-lexer \
bundled-node-corepack \
bundled-node-minimatch \
bundled-node-streamsearch \
bundled-node-undici \
bundled-simdutf \
bundled-uvwasi \
bundled-v8 \
nodejs \
nodejs-abi \
nodejs-engine \
nodejs20"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/update-alternatives \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libnghttp2.so.14 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
nodejs-common"

inherit rpm
