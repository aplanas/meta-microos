SUMMARY = "C interface to suseconnect-ng"
DESCRIPTION = "This package contains library which provides C interface to selected \
suseconnect-ng functions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0~git0.ae8ba1e"

RPM_NAME = "libsuseconnect-1.3.0~git0.ae8ba1e-1.1.aarch64.rpm"
RPM_HASH = "a148ef5e798d0790d28bfe4bfedd33e0dc0e67a42b37c61416995723b60fe04c5a84264e4d74ecfef61486a5ccedec673beaabcf79fed21631370792e897b137"

RPROVIDES:${PN} += "libsuseconnect"

RDEPENDS:${PN} += "suseconnect-ng"

inherit rpm
