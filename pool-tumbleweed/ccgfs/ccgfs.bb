SUMMARY = "Transport-agnostic network filesystem"
DESCRIPTION = "ccgfs is a transport-agnostic filesystem. Common transport modes are \
'pull' and 'push', the latter of which makes it possible to export a \
filesystem located in a LAN to a DMZ host without needing to allow \
connections from the DMZ as would be the case with the pull model. \
Any transport can be used, e.g. ssh for encryption."
LICENSE = "GPL-3.0-only"

PV = "0.81.g3"

RPM_NAME = "ccgfs-0.81.g3-1.20.aarch64.rpm"
RPM_HASH = "b0f0a904830ff6fd93ce82b0bc79a74fb07bb520d9f8ef27db92f493684252e8e0ca40cd8aa4fe90041b1300a482234b6b9a7a9ff5caa0778705c2e1543452e7"

RPROVIDES:${PN} += "ccgfs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libxml2.so.2"

inherit rpm
