SUMMARY = "Yet Another JSON Library (Static Library)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for linking statically \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-static-2.1.0-7.2.aarch64.rpm"
RPM_HASH = "2647fa9ffb8cab8df28cdeba67f140fd9ee225da14ed8b23d23872faa8dc6fc74145063e18eda0ae25035ae5ce5caeec76b427f99f8a9ad711f8565f62243b3d"

RPROVIDES:${PN} += "libyajl-devel-static"

RDEPENDS:${PN} += "libyajl-devel"

inherit rpm
