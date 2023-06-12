SUMMARY = "Development files for Csound"
DESCRIPTION = "Development files for Csound, a sound synthesis program."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "csound-devel-6.18.1-3.1.aarch64.rpm"
RPM_HASH = "3a9c2d7dba9a64c0092da4ad5b53e01cb1e77916152ad4b973417f589495423c9cd652acfd23724d30791cd3ca6bafc232f6071616d7a1c4afb775c7c635bae4"

RPROVIDES:${PN} += "csound-devel \
csound-devel(aarch-64)"
RDEPENDS:${PN} += "libcsnd6-6_0 \
libcsound64-6_0"

inherit rpm
