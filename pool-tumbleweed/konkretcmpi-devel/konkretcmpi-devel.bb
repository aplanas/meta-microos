SUMMARY = "Development files for konkretcmpi"
DESCRIPTION = "An open-source tool for rapidly developing CMPI providers in the C \
programming language. KonkretCMPI makes CMPI provider development \
easier by generating type-safe concrete CIM interfaces from MOF \
definitions and by providing default implementations for many of the \
provider operations."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "konkretcmpi-devel-0.9.2-14.4.aarch64.rpm"
RPM_HASH = "7d318f3dfe9a4baffe40fffff535deb67ad5bfe1bd07661d0711d9c8fdc41c66b74cdaabe0cfcc9dd9398c4a50521a839eb398c48469602636b6384aa82180ed"

RPROVIDES:${PN} += "konkretcmpi-devel"

RDEPENDS:${PN} += "cim-schema \
cmake \
libc.so.6 \
libgcc-s.so.1 \
libkonkretmof.so.0 \
libstdc++.so.6 \
sblim-cmpi-devel"

inherit rpm
