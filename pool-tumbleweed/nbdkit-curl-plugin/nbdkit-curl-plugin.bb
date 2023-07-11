SUMMARY = "HTTP/FTP (cURL) plugin for nbdkit"
DESCRIPTION = "This package contains cURL (HTTP/FTP) support for nbdkit."
LICENSE = "BSD-3-Clause"

PV = "1.32.2"

RPM_NAME = "nbdkit-curl-plugin-1.32.2-1.4.aarch64.rpm"
RPM_HASH = "d9a010e213c0faef0890f32e92866f923442b401a1f58fe1e4562a21861f09b4b282bd6ba91e9f2970d62d38ffc0c56111240c25e4fbee988f28590bb34944ae"

RPROVIDES:${PN} += "nbdkit-curl-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
nbdkit-server"

inherit rpm
