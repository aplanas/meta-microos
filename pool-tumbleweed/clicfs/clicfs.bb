SUMMARY = "Compressed Loop Image Container"
DESCRIPTION = "Clic FS is a FUSE file system to mount a Compressed Loop Image \
Container. It has several features that make it a good choice for live \
systems. It will compress a Loop Image and export it as read write, \
creating a copy on write behaviour."
LICENSE = "GPL-2.0"

PV = "1.4.6"

RPM_NAME = "clicfs-1.4.6-7.29.aarch64.rpm"
RPM_HASH = "65bc47a4decde6a4ec21b353e8a5987753f5d00e369cd7ef59e088ebf15c839eb5f8e91af29e89ee0af5b071368fab24ec62d545a1012434c14ac8fbb1fbad70"

RPROVIDES:${PN} += "clicfs"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfuse.so.2 \
libgcc-s.so.1 \
liblzma.so.5 \
libstdc++.so.6"

inherit rpm
