SUMMARY = "Libraries and headers to develop with libTMCG library"
DESCRIPTION = "Libraries and headers to develop with the libTMCG library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.18"

RPM_NAME = "libTMCG-devel-1.3.18-1.17.aarch64.rpm"
RPM_HASH = "e8163f5f819ce569bff0b149b08f4ab64cd1ab1b5baa6bad7b7901bf3920f75a704d0e87d3c38046f5938248b767cfbf6f2f7aed7422b6b97e3251ce24e3c5b2"

RPROVIDES:${PN} += "libTMCG-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libTMCG18"

inherit rpm
