SUMMARY = "Devel files for python310-PyQt6-WebEngine"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-WebEngine"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-WebEngine-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "bca375421258088e3a76d726fb41580e98d09367707521da2d542cc1459d33896dd2e85f151d5a375ec5168142658e350fa4bd6b7ded19d29d99ae2764529c9b"

RPROVIDES:${PN} += "python310-PyQt6-WebEngine-devel"

RDEPENDS:${PN} += "python310-PyQt6-devel"

inherit rpm
