SUMMARY = "Cloud storage client"
DESCRIPTION = "Seafile is an open source cloud storage system with features on privacy protection and teamwork. Collections of files are \
called libraries, and each library can be synced separately. A library can also be encrypted with a user chosen password. \
Seafile also allows users to create groups and easily sharing files into groups."
LICENSE = "GPL-2.0-only"

PV = "9.0.3"

RPM_NAME = "seafile-9.0.3-1.1.aarch64.rpm"
RPM_HASH = "1aca20ac3c50be7bc91c9d78370f7ba231644cb942bcf8d740b6a162cb7b8087edfb0317d25b520c9052402c648350515c78a975ef5597969573baaac1d90ca7"

RPROVIDES:${PN} += "seafile"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libevent-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjansson.so.4 \
libsearpc.so.1 \
libsqlite3.so.0 \
libssl.so.3 \
libuuid.so.1 \
libz.so.1 \
python-abi"

inherit rpm
