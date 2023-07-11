SUMMARY = "Python bindings for FUSE"
DESCRIPTION = "Python bindings for FUSE (User space File System)"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "python310-fuse-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "6a2d01be072649d25ad74bd0b251dbbd654a594a27602e335f40ad9fc0502813c41358f7d36441c9cb1ed4c68d7b84fcdeadb40ae75740deb43f8c54774717c2"

RPROVIDES:${PN} += "python3.10dist-fuse-python \
python310-fuse \
python3dist-fuse-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
