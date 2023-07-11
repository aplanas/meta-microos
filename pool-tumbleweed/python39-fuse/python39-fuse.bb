SUMMARY = "Python bindings for FUSE"
DESCRIPTION = "Python bindings for FUSE (User space File System)"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "python39-fuse-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "785a3d475c01ad93eb42a13d3ee357c24663165e6b59a15054343518490bc0655b6c2940ba6ec0d94e21046e78e8f13529ae1acd409a412d8f8e6c2dfca9ea60"

RPROVIDES:${PN} += "python3.9dist-fuse-python \
python39-fuse \
python3dist-fuse-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
