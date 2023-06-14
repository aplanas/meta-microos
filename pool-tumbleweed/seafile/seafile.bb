SUMMARY = "Cloud storage client"
DESCRIPTION = "Seafile is an open source cloud storage system with features on privacy protection and teamwork. Collections of files are \
called libraries, and each library can be synced separately. A library can also be encrypted with a user chosen password. \
Seafile also allows users to create groups and easily sharing files into groups."
LICENSE = "GPL-2.0-only"

PV = "9.0.1"

RPM_NAME = "seafile-9.0.1-1.1.aarch64.rpm"
RPM_HASH = "a1198e1e0bac77ca6b59a5e83a93185a2f11815d51d40ebb4620ce1a5d64cb73e03df842cf18a08f092ed0f76d21f3f0093e8a3726f88b6217170794446e1e1d"

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
