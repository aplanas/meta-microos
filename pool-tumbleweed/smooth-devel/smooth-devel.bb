SUMMARY = "Development files for smooth"
DESCRIPTION = "The smooth-devel package contains libraries and header files for \
developing applications that use smooth."
LICENSE = "Artistic-2.0"

PV = "0.9.9"

RPM_NAME = "smooth-devel-0.9.9-1.5.aarch64.rpm"
RPM_HASH = "c78dc3440cd83f44969404b0f5a9e60c07ba905ff3dd81ae9be573b8209f8601fcb410757033c5eab8744e67da88e7962aab4f6d6c5282f4c6b64a67a23fc355"

RPROVIDES:${PN} += "smooth-devel \
smooth-devel(aarch-64)"

RDEPENDS:${PN} += "libsmooth-0_9-0 \
pkgconfig(x11)"

inherit rpm
