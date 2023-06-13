SUMMARY = "Additional spline functions for Octave"
DESCRIPTION = "Additional spline functions. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later & SUSE-Public-Domain"

PV = "1.3.4"

RPM_NAME = "octave-forge-splines-1.3.4-1.9.noarch.rpm"
RPM_HASH = "217ec1699df5e9b63ac4dfd4d811a8c269b55bbbece9ff73dd2472d3c44d0ac38b41c23c026d89fb8a6860a796e5d12504c92e15a16707e9f3d4c36c7ae6cf94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-splines"

RDEPENDS:${PN} += "/bin/sh \
octave-cli"

inherit rpm
