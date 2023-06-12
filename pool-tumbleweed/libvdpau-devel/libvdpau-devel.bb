SUMMARY = "VDPAU wrapper development files"
DESCRIPTION = "Note that this package only contains the VDPAU headers that are required to \
build applications. At runtime, the shared libraries are needed too and may \
be installed using the proprietary nVidia driver packages."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "libvdpau-devel-1.5-1.6.aarch64.rpm"
RPM_HASH = "98b0770c320e7cda00327db941aaa1fae61dd0ec8343e4ebaa0945858ea1c42a4d00d8c43102737da8f3622ebcb9ac13b3fa13cf23ce71973dec14bfae4a7977"

RPROVIDES:${PN} += "libvdpau-devel \
libvdpau-devel(aarch-64) \
pkgconfig(vdpau)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvdpau1"

inherit rpm
