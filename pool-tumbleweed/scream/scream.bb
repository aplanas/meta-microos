SUMMARY = "Receiver for Scream virtual devices"
DESCRIPTION = "Scream is a virtual device driver for Windows that provides a discrete sound device. \
 \
This package contains the Linux receiver."
LICENSE = "MS-PL"

PV = "4.0"

RPM_NAME = "scream-4.0-1.1.aarch64.rpm"
RPM_HASH = "5f064c36f60c2782a3f07e0c6cb948104b47a597bed1d99fff1ffb6e284ac7bc481230b63939e4d3d5350764049baf6ea03b983cc3168784cfb2d6784d3f5c02"

RPROVIDES:${PN} += "scream"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
