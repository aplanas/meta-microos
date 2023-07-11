SUMMARY = "Python bindings for FUSE"
DESCRIPTION = "Python bindings for FUSE (User space File System)"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "python311-fuse-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "62c3486a15404e72dd70e4ed5ea59beea9442181a8944f583562fe5eed53d7068f1a090780c89406a8be4650dfa37e0e99d555e62f7387a3aa066ab0be3ddf16"

RPROVIDES:${PN} += "python3-fuse \
python3.11dist-fuse-python \
python311-fuse \
python3dist-fuse-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
