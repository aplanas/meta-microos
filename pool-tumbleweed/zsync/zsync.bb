SUMMARY = "Client-side Implementation of the Rsync Algorithm over HTTP"
DESCRIPTION = "zsync is a implementation of rsync over HTTP. It allows updating of files from \
a remote Web server without requiring a full download or a special remote \
server application. It uses a metafile, which is created on the server, \
to determine which parts of a file the user already has; it then downloads \
the remaining parts via HTTP. No special server or Web server module is \
needed. It also works with gzip files, and content on the server can be \
compressed to further reduce download times."
LICENSE = "Artistic-2.0"

PV = "0.6.2"

RPM_NAME = "zsync-0.6.2-25.15.aarch64.rpm"
RPM_HASH = "a2de98bb1c77c719491750aca5a513f3f86f7f49a2a1306b4540379b1a43548d42f1f4b48739471c5f9ea2272b2351382e07e2d80bb0400cec0accde88e7fe41"

RPROVIDES:${PN} += "zsync"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
