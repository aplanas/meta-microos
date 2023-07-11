SUMMARY = "Development files for the Osmocom MS lookup library"
DESCRIPTION = "This shared library contains routines for looking up mobile subscribers. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mslookup."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-mslookup-devel-1.4.0-1.12.aarch64.rpm"
RPM_HASH = "e83d329889f37a1f74e42650bdf3457f50f6202bbb326ed8f6bad2fb40e120579b2bdf49c1c5c06f681c7800d5e5e711dc415be1850499893bd3fc258efe3e1e"

RPROVIDES:${PN} += "libosmo-mslookup-devel \
pkgconfig-libosmo-mslookup"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-mslookup0"

inherit rpm
