SUMMARY = "SeaDrive daemon with FUSE interface"
DESCRIPTION = "The Drive client enables you to access files on the server without \
syncing to local disk. It works like a network drive."
LICENSE = "GPL-2.0-only"

PV = "2.0.22"

RPM_NAME = "seadrive-fuse-2.0.22-1.6.aarch64.rpm"
RPM_HASH = "eff980cbcf9f992b3d61b3a3720cb42a65c278bab3ec656e34c7d9899524468c0a581ec72ac4bc91b28b4a22dfa36f624e746ee2651070b1abf2e5ac502e6592"

RPROVIDES:${PN} += "seadrive-fuse"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libevent-2.1.so.7 \
libfuse.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libsearpc.so.1 \
libsqlite3.so.0 \
libuuid.so.1 \
libz.so.1 \
python-abi"

inherit rpm
