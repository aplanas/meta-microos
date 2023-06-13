SUMMARY = "SeaDrive daemon with FUSE interface"
DESCRIPTION = "The Drive client enables you to access files on the server without \
syncing to local disk. It works like a network drive."
LICENSE = "GPL-2.0-only"

PV = "2.0.22"

RPM_NAME = "seadrive-fuse-2.0.22-1.6.aarch64.rpm"
RPM_HASH = "eff980cbcf9f992b3d61b3a3720cb42a65c278bab3ec656e34c7d9899524468c0a581ec72ac4bc91b28b4a22dfa36f624e746ee2651070b1abf2e5ac502e6592"

RPROVIDES:${PN} += "seadrive-fuse \
seadrive-fuse(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libevent-2.1.so.7()(64bit) \
libfuse.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjansson.so.4()(64bit) \
libsearpc.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libuuid.so.1()(64bit) \
libz.so.1()(64bit) \
python(abi)"

inherit rpm
