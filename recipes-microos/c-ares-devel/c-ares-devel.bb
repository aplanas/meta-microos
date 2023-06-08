SUMMARY = "Development files for c-ares"
DESCRIPTION = "c-ares is a C library that performs DNS requests and name resolves \
asynchronously. c-ares is a fork of the library named 'ares', written \
by Greg Hudson at MIT. \
 \
This package provides the development libraries and headers needed \
to build packages that depend on c-ares."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "c-ares-devel-1.19.0-2.3.aarch64.rpm"
RPM_HASH = "f863b964bc2d50ea0c487f62a84710a9448fbb82e825b49dd6f05dc9735b80830d70d29e310957b4a15edbefa25f46934f3f0419a9c6ed98189fb8ea5f6e68a2"

RPROVIDES:${PN} += "c-ares-devel c-ares-devel(aarch-64) cmake(c-ares) libcares-devel pkgconfig(libcares)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libcares2"

inherit rpm
