SUMMARY = "Development Library and Header Files for FreeWnn"
DESCRIPTION = "This package contains the header files and libraries for building \
client programs which use FreeWnn for Japanese input."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fwnn-devel-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "bdfaf9330ecb783939725c7051dc40c3e044ee61a59aa4d69738925920c7bd9db2f62cc7389cee3f3b9e799e0e138354f171c03188e3cf73c4cc01911b6a5efb"

RPROVIDES:${PN} += "fwnn-devel \
fwnndev"

RDEPENDS:${PN} += "fcwnn-devel \
fwnn \
libjd0 \
libwnn0"

inherit rpm
