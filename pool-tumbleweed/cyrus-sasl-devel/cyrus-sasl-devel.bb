SUMMARY = "Cyrus SASL API Implementation, Libraries and Header Files"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-devel-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "78647dcbc2c90d7a19112f003601086c5673be6ee4bfa7e55e6c4df74326dec2d053f3ff4f58338e39c86eb3ac32da1790465f3a1174b2106f9380e2fbc69e58"

RPROVIDES:${PN} += "cyrus-sasl-devel \
cyrus-sasl-devel(aarch-64) \
pkgconfig(libsasl2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsasl2-3"

inherit rpm
