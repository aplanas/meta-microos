SUMMARY = "Development files for libsignal-protocol-c"
DESCRIPTION = "Development files and headers for libsignal-protocol-c"
LICENSE = "GPL-3.0-only"

PV = "2.3.3"

RPM_NAME = "libsignal-protocol-c-devel-2.3.3-1.14.aarch64.rpm"
RPM_HASH = "ace6181cc9f547191987892194438652714baa91ef7fa161d6902ee9433fc04810b300dcdf520274129190796f5f6ad7fee24c7899e1d006a1ed3032888dcb85"

RPROVIDES:${PN} += "libsignal-protocol-c-devel \
pkgconfig-libsignal-protocol-c"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignal-protocol-c2"

inherit rpm
