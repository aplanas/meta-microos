SUMMARY = "Tools for reading RAW files obtained from digital photo cameras"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.21.1"

RPM_NAME = "libraw-tools-0.21.1-2.2.aarch64.rpm"
RPM_HASH = "457c97617693fcb55555f433d4e1e3597cd6f48358878f8991f3469089f34ab13735e4376f68ba2401bf2ab99f9d44fc35f72bc99266b9aa9ea5ed8cff6a438f"

RPROVIDES:${PN} += "libraw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libjpeg.so.8 \
libm.so.6 \
libraw-r.so.23 \
libraw.so.23 \
libstdc++.so.6"

inherit rpm
