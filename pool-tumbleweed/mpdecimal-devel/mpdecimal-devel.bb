SUMMARY = "Development headers and documentation for mpdecimal"
DESCRIPTION = "The package contains documentation and development headers for \
libmpdec and libmpdec++."
LICENSE = "BSD-2-Clause"

PV = "2.5.1"

RPM_NAME = "mpdecimal-devel-2.5.1-2.13.aarch64.rpm"
RPM_HASH = "f24314afe5111be16906717bee38dcacd926df951de91d4d704938d5ec418bd52be434e89ea50ba15e0747548b1b2ac083ddbbc612c8c1e08226ac9f2575025d"

RPROVIDES:${PN} += "mpdecimal-devel"

RDEPENDS:${PN} += "libmpdec++3 \
libmpdec3"

inherit rpm
