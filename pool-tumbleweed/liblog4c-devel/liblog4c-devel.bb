SUMMARY = "Development files for log4c"
DESCRIPTION = "The liblog4c-devel package contains the static libraries and header \
files needed for development with log4c."
LICENSE = "LGPL-2.1+"

PV = "1.2.4"

RPM_NAME = "liblog4c-devel-1.2.4-5.26.aarch64.rpm"
RPM_HASH = "f989e8340d3342cb1d38fd7335d22aeb01c4d0038045bf1056846274b0b655a2b9f074ea2b27eff1edb4a19ccd63d1c2ca73902166418c0c1d14b7fe4e4a0bca"

RPROVIDES:${PN} += "liblog4c-devel \
liblog4c-devel(aarch-64) \
pkgconfig(log4c)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
liblog4c3"

inherit rpm
