SUMMARY = "API documentation for the libspf2 library"
DESCRIPTION = "The libspf2-apidocs package contains the API documentation for creating \
applications that use the libspf2 (Sender Policy Framework) library."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-apidocs-1.2.11-6.14.noarch.rpm"
RPM_HASH = "eb92c4909d48beb68bc698ff35b1c6c966b083bbb9f9f25ebf02671652867e7ce488fa055a2bc3bf6fd570f43a9a4d5bfccd69c668fb5bf6e549fce411f4d9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libspf2-apidocs"

RDEPENDS:${PN} += ""

inherit rpm
