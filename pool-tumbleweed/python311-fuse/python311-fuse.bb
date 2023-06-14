SUMMARY = "Python bindings for FUSE"
DESCRIPTION = "Python bindings for FUSE (User space File System)"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "python311-fuse-1.0.5-1.4.aarch64.rpm"
RPM_HASH = "16c104454ac1d7d250e22c365cb6364352a3095feb785a0ca25d379b4ef147b401c129ea0301ea564ab45cf7286c706182a94f58f4e31532a4a9679e53aaff7a"

RPROVIDES:${PN} += "python3.11dist-fuse-python \
python311-fuse \
python3dist-fuse-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2 \
python-abi"

inherit rpm
