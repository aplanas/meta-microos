SUMMARY = "Evented I/O for V8 JavaScript"
DESCRIPTION = "Node.js is a JavaScript runtime built on Chrome's V8 JavaScript engine. Node.js \
uses an event-driven, non-blocking I/O model. Node.js has a package ecosystem \
provided by npm."
LICENSE = "MIT"

PV = "20.6.0"

RPM_NAME = "nodejs20-20.6.0-2.1.aarch64.rpm"
RPM_HASH = "b3ed083c2aa87bd577eb8f22c00e67d0f34e5e7754e1f724b95277b8b01dfb4bbee4f5f5b5b2b430465eae8236895e4fb7560cdd33e722c67143205665cc1bab"

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
