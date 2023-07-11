SUMMARY = "Discord RPC library"
DESCRIPTION = "This is a library for interfacing your game with a locally running Discord \
desktop client."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "libdiscord-rpc3_4_0-3.4.0-3.4.aarch64.rpm"
RPM_HASH = "aad1fc492b3ed81779b930238b57bf572ed4f95cb7236e7e95112d036f1515568405bde9accf25b2550d2bd4a820c8ed43b2b0fd424f7c97ebbc4a04337d2d5a"

RPROVIDES:${PN} += "libdiscord-rpc.so.3.4.0 \
libdiscord-rpc3-4-0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
