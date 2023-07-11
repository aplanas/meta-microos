SUMMARY = "Transport-agnostic network filesystem"
DESCRIPTION = "ccgfs is a transport-agnostic filesystem. Common transport modes are \
'pull' and 'push', the latter of which makes it possible to export a \
filesystem located in a LAN to a DMZ host without needing to allow \
connections from the DMZ as would be the case with the pull model. \
Any transport can be used, e.g. ssh for encryption."
LICENSE = "GPL-3.0-only"

PV = "0.81.g3"

RPM_NAME = "ccgfs-0.81.g3-1.21.aarch64.rpm"
RPM_HASH = "91adaf785e417a755e54aa2deb8395e1efa73558e8411dfb26a37f2ceb11271a58abf97ec457f66699728f36d01bae0a64e13afeb60bb65fe1ebd22c79b3e3b7"

RPROVIDES:${PN} += "ccgfs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libHX.so.32 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libxml2.so.2"

inherit rpm
