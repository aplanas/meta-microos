SUMMARY = "FUSE implementation for overlayfs"
DESCRIPTION = "An implementation of overlay+shiftfs in FUSE for rootless containers."
LICENSE = "GPL-2.0-or-later"

PV = "1.12"

RPM_NAME = "fuse-overlayfs-1.12-1.1.aarch64.rpm"
RPM_HASH = "c964c30458c8f121c1fbd502c09c385b8216c034d41b55493e7586b10a1d95fe482abf8b95d531c458be7ae27d6260a518ab7af89701010d8e28d47464b01388"

RPROVIDES:${PN} += "fuse-overlayfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3"

inherit rpm
