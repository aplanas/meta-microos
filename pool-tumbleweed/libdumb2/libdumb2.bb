SUMMARY = "Tracker module player library"
DESCRIPTION = "DUMB is a module audio renderer library. \
It reads module files and outputs audio that can be dumped \
to the actual audio playback library. \
 \
This package contains the shared libraries for dumb."
LICENSE = "Zlib"

PV = "2.0.3"

RPM_NAME = "libdumb2-2.0.3-1.10.aarch64.rpm"
RPM_HASH = "2e29bd98a6d583737f18bfa289ed57914356033ceb0605e2db215883276676dd20f1f8191824c967b504e8548f3871668a9b2c6d534108e87da810fecd287692"

RPROVIDES:${PN} += "libdumb.so.2 \
libdumb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
