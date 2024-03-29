SUMMARY = "User space tools for Cell/B.E."
DESCRIPTION = "The spu-tools package contains user space tools for Cell/B.E. \
   Currently, it contain two tools: - spu-top: a tool like top to \
   watch the SPU's on a Cell BE System. It shows information about \
   SPUs and running SPU contexts. \
 \
- spu-ps: a tool like ps, which dumps a report on the currently running \
SPU contexts."
LICENSE = "GPL-2.0"

PV = "2.3.0"

RPM_NAME = "spu-tools-2.3.0-27.25.aarch64.rpm"
RPM_HASH = "1eb5a2d37e28541429a8e848eb4ba1163f5b6a3d349ffb26496f25da46bd63e411b6f0cc3badda60497923aebc19b840caf6eb8715203314836fa642a40b70e1"

RPROVIDES:${PN} += "spu-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
