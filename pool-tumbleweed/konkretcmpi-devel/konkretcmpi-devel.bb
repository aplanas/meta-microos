SUMMARY = "Development files for konkretcmpi"
DESCRIPTION = "An open-source tool for rapidly developing CMPI providers in the C \
programming language. KonkretCMPI makes CMPI provider development \
easier by generating type-safe concrete CIM interfaces from MOF \
definitions and by providing default implementations for many of the \
provider operations."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "konkretcmpi-devel-0.9.2-14.3.aarch64.rpm"
RPM_HASH = "8eec57429e44e3028533962a26a40e1fe97b855581e10efcb4bb2fa4429feed9023e040db01a141af7f27371b22bc104b890b10b7b65625eee1cb9ec79de0fe1"

RPROVIDES:${PN} += "konkretcmpi-devel"

RDEPENDS:${PN} += "cim-schema \
cmake \
libc.so.6 \
libgcc-s.so.1 \
libkonkretmof.so.0 \
libstdc++.so.6 \
sblim-cmpi-devel"

inherit rpm
