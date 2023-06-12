SUMMARY = "Development files for libhtp"
DESCRIPTION = "The libhtp-devel package contains libraries and header files for \
developing applications that use libhtp."
LICENSE = "BSD-3-Clause"

PV = "0.5.43"

RPM_NAME = "libhtp-devel-0.5.43-1.1.aarch64.rpm"
RPM_HASH = "4fad410545cb50b549316fe4d61e147c9f0be2a1bdcc48f0ab8552339db9765d34b8a23e6b84837343ff593361d637c35c4a480f3711a3be74b845b89268ae7c"

RPROVIDES:${PN} += "libhtp-devel \
libhtp-devel(aarch-64) \
pkgconfig(htp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhtp2"

inherit rpm
