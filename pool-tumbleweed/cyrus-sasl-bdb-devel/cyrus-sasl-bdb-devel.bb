SUMMARY = "Cyrus SASL API Implementation, Libraries and Header Files"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-devel-2.1.28-5.1.aarch64.rpm"
RPM_HASH = "77ff4cf1f5e72d0c9942a75ac0cf41ac9924d6e1719ad914552f552610cc4844e2908c3077f8d44a7945ce30ab49e5a9bf7f0d0ae4ca15af5297169d6645f09b"

RPROVIDES:${PN} += "cyrus-sasl-bdb-devel \
cyrus-sasl-bdb-devel(aarch-64) \
pkgconfig(libsasl2)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libsasl2-3"

inherit rpm
