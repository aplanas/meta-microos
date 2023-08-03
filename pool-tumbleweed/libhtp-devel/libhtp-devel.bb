SUMMARY = "Development files for libhtp"
DESCRIPTION = "The libhtp-devel package contains libraries and header files for \
developing applications that use libhtp."
LICENSE = "BSD-3-Clause"

PV = "0.5.45"

RPM_NAME = "libhtp-devel-0.5.45-1.1.aarch64.rpm"
RPM_HASH = "ef4a1858e15061746133fa1774b946eef1ba901212b2e98007ef8fd4f4b74c9789566969ef9af71031c592eedb739f0ff08301727431d803b1fd226ecc985c4d"

RPROVIDES:${PN} += "libhtp-devel \
pkgconfig-htp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhtp2"

inherit rpm
