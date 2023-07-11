SUMMARY = "Development files for smooth"
DESCRIPTION = "The smooth-devel package contains libraries and header files for \
developing applications that use smooth."
LICENSE = "Artistic-2.0"

PV = "0.9.10"

RPM_NAME = "smooth-devel-0.9.10-1.1.aarch64.rpm"
RPM_HASH = "24be872f528b6e5d69168aac10ee8c92fc2ef1744be26c38f4569c7ce557a192268f87092a68da63a4b75cdab038e034a76937f4da6cdb4a1b4039ed8ac2377f"

RPROVIDES:${PN} += "smooth-devel"

RDEPENDS:${PN} += "libsmooth-0-9-0 \
pkgconfig-x11"

inherit rpm
