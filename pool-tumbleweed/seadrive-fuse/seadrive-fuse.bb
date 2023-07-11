SUMMARY = "SeaDrive daemon with FUSE interface"
DESCRIPTION = "The Drive client enables you to access files on the server without \
syncing to local disk. It works like a network drive."
LICENSE = "GPL-2.0-only"

PV = "2.0.22"

RPM_NAME = "seadrive-fuse-2.0.22-1.7.aarch64.rpm"
RPM_HASH = "b59e1fc5725fb3b3b7080d16fa0ba60cb389701c6d261e52347fcaf416f780ec940722cebabda347164a584f9c4cefe4cebefd290308f30c320892aaeceabaf8"

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
