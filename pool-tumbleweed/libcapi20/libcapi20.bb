SUMMARY = "Library for the Common ISDN Application Programming Interface"
DESCRIPTION = "libcapi handles requests from CAPI-driven applications such as fax \
systems via active and passive ISDN cards."
LICENSE = "LGPL-2.1-or-later"

PV = "3.27"

RPM_NAME = "libcapi20-3.27-2.8.aarch64.rpm"
RPM_HASH = "5fa114d8cfd8f0ce0403d65d3471e18e124cf0a55937cb9307aef4a854e32cd5144d9f5b36afe1a0724d371035d1bdb9e71d2023ffcc8e3daad39ef2eb1c2a74"

RPROVIDES:${PN} += "libcapi20"

RDEPENDS:${PN} += ""

inherit rpm
