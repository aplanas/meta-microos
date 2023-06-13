SUMMARY = "Development package for Palapeli"
DESCRIPTION = "This package contains the development files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "palapeli-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "744baaa4e0420781b0188ca09bc7a157b1d3310d7d98110cf7bd570815c2b3b9e102a24fdad8b53d41510c8e311c3f3479295e8f3839f389f1d9b2b095374f96"

RPROVIDES:${PN} += "cmake(Pala) \
palapeli-devel \
palapeli-devel(aarch-64)"

RDEPENDS:${PN} += "palapeli"

inherit rpm
