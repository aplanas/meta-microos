SUMMARY = "Discord RPC library"
DESCRIPTION = "This is a library for interfacing your game with a locally running Discord \
desktop client."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "libdiscord-rpc3_4_0-3.4.0-3.3.aarch64.rpm"
RPM_HASH = "c271ff2f987aa939d0da75858d453f9449e3f1b60e38b5710b70b9965ae994359a4a4021de8a33985e1ad396fadb52d744d53cdfb625a2a54ed3d223a105e01f"

RPROVIDES:${PN} += "libdiscord-rpc.so.3.4.0 \
libdiscord-rpc3-4-0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
