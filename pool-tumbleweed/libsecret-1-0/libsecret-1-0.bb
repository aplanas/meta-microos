SUMMARY = "Library for accessing the Secret Service API"
DESCRIPTION = "libsecret is a library for storing and retrieving passwords and other \
secrets. It communicates with the 'Secret Service' using DBus."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "libsecret-1-0-0.20.5-1.8.aarch64.rpm"
RPM_HASH = "f5ba12b414e257b584f9cd6233a9a8ffaa0f97d6c0aa5b0720155f2e3820f568f663dc6728708b119834ace69b6760c0e04480039767e6e72bb8a382f1d65f32"

RPROVIDES:${PN} += "libsecret \
libsecret-1-0 \
libsecret-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
