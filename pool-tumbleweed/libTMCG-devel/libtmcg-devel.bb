SUMMARY = "Libraries and headers to develop with libTMCG library"
DESCRIPTION = "Libraries and headers to develop with the libTMCG library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.18"

RPM_NAME = "libTMCG-devel-1.3.18-1.18.aarch64.rpm"
RPM_HASH = "ce951ee9793114d3307fd53125123a4f6af228e6895dc38ca9b3d57bcdee69a3014e903db630a7ccdf767bbc74f8a5caab515f40b8f1538608d02391fe57210a"

RPROVIDES:${PN} += "libTMCG-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libTMCG18"

inherit rpm
