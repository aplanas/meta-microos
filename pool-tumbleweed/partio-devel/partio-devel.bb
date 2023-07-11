SUMMARY = "Development files for partio"
DESCRIPTION = "The partio-devel package contains libraries and header files for \
developing applications that use partio."
LICENSE = "BSD-3-Clause"

PV = "1.14.6"

RPM_NAME = "partio-devel-1.14.6-1.10.aarch64.rpm"
RPM_HASH = "0de7801fd1a9ef14c6d3b00e3029c46863570d52873567ec53b6f55724f8912da2532e0f498b2a55f7597aa132f567dfabd74820feb7dfdba450af6e25aad970"

RPROVIDES:${PN} += "partio-devel"

RDEPENDS:${PN} += "libpartio1"

inherit rpm
