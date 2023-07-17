SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libsmartcols-devel-static-2.39-2.1.aarch64.rpm"
RPM_HASH = "0fd3fad5437b0e2be9eb2f0df21ac755e0dabc34d1c7352bba6d36977786152a43175b675e567c5ae46e2e6f7665ee0dd4d40026045385bbeceb49665852a7a8"

RPROVIDES:${PN} += "libsmartcols-devel-static"

RDEPENDS:${PN} += "libsmartcols-devel"

inherit rpm
