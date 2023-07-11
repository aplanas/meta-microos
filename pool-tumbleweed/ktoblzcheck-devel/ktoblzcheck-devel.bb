SUMMARY = "KtoBLZCheck development files"
DESCRIPTION = "Libraries, includes etc to develop with ktoblzcheck library."
LICENSE = "LGPL-2.1-only"

PV = "1.53"

RPM_NAME = "ktoblzcheck-devel-1.53-1.5.aarch64.rpm"
RPM_HASH = "de2f784b09db89e46cd6d151faab207aae97969cdea1ced317f12efd73be62b951b08a81dac609b00cef1578af9715b771f85534ba397d2554b0d0bdfb4d11a1"

RPROVIDES:${PN} += "cmake-KtoBlzCheck \
ktoblzcheck-devel \
libktoblzcheck1-devel \
pkgconfig-ktoblzcheck"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libktoblzcheck1"

inherit rpm
