SUMMARY = "Development files for Csound"
DESCRIPTION = "Development files for Csound, a sound synthesis program."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-devel-6.18.1-3.2.aarch64.rpm"
RPM_HASH = "a22c6b0b90e2944c34474d85175778878763476dccab2b14384a8ddaecc2e20edf04a74e5fe6016286c99f20824afb079cc30e3e4dcea183c5727486e1a7fc4d"

RPROVIDES:${PN} += "csound-devel"

RDEPENDS:${PN} += "libcsnd6-6-0 \
libcsound64-6-0"

inherit rpm
