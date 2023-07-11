SUMMARY = "Devel files for libnet"
DESCRIPTION = "Libnet is an API to help with the construction and handling of network \
packets. This package contains devel files."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "libnet-devel-1.2-3.9.aarch64.rpm"
RPM_HASH = "1954d27d6ef0d61a52d90c650def216227ceee365b5f4e77bc84ce062e3cb2675a756e33ce972a353b6f561c6ca0f1c37b8485a12fbc647ff08f0d6509449b0b"

RPROVIDES:${PN} += "libnet-devel \
pkgconfig-libnet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libnet9"

inherit rpm
