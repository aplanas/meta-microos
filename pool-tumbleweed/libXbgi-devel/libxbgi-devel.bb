SUMMARY = "Development files for the XBGI library"
DESCRIPTION = "libXbgi is a Borland Graphics Interface (BGI) emulation library for \
X11. This library strictly emulates most BGI functions, making it \
possible to compile X11 versions of programs written for \
Turbo/Borland C. RGB extensions and basic mouse support are also \
implemented. \
 \
This package contains the development headers for the library found \
in libXbgi1."
LICENSE = "MIT"

PV = "365"

RPM_NAME = "libXbgi-devel-365-1.12.aarch64.rpm"
RPM_HASH = "5a06565b9d00ead9f9ccb144e7698560385a8f6e3b8c1b615dd714a2fc23598ca9a5ffcdfd64f0c0d0d8d1025b91f1a65f36989427de317b6c91c6451f263acb"

RPROVIDES:${PN} += "libXbgi-devel"

RDEPENDS:${PN} += "libX11-devel \
libXbgi1 \
xorg-x11-proto-devel"

inherit rpm
