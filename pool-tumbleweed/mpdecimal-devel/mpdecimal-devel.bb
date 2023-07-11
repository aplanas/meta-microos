SUMMARY = "Development headers and documentation for mpdecimal"
DESCRIPTION = "The package contains documentation and development headers for \
libmpdec and libmpdec++."
LICENSE = "BSD-2-Clause"

PV = "2.5.1"

RPM_NAME = "mpdecimal-devel-2.5.1-2.14.aarch64.rpm"
RPM_HASH = "454f5150bd5b89f848430f884c8148b1735600043e97a4c2cce30178558b53b7536c18d05c6172f21b70eab5d7a5ac824c96992bf1ff953f9c7320bd9f0e1d8b"

RPROVIDES:${PN} += "mpdecimal-devel"

RDEPENDS:${PN} += "libmpdec++3 \
libmpdec3"

inherit rpm
