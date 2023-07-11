SUMMARY = "Dependencies to build ghc"
DESCRIPTION = "Prebuild alex and happy for bootstrapping the proper ghc build. \
Don't use outside of GHC bootstrapping!"
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-bootstrap-helpers-1.3-2.1.aarch64.rpm"
RPM_HASH = "65685561ea24357dcc30fc71b47a8e36e18eb96523b584079117262a1ea598294f59bd024863d3acd7eaf560a3a4bd7d20e135b0ea71e1f022b6c80ceb6998f4"

RPROVIDES:${PN} += "ghc-bootstrap-helpers"

RDEPENDS:${PN} += "libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
this-is-only-for-build-envs"

inherit rpm
