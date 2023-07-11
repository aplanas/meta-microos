SUMMARY = "Documentation for wcslib library"
DESCRIPTION = "This package contains documentation and help files for wcslib library."
LICENSE = "LGPL-3.0-or-later"

PV = "7.12"

RPM_NAME = "wcslib-doc-7.12-1.7.noarch.rpm"
RPM_HASH = "1f3d08b81def9900ef423fef2e501e0b16efd22e39545f7d6104776a5a9cb2846c6fca5e3076870e86e44e1713b73daa2685ff010b29891f9f3cd7ec90ebb32c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libwcs-doc \
wcslib-doc"

RDEPENDS:${PN} += ""

inherit rpm
