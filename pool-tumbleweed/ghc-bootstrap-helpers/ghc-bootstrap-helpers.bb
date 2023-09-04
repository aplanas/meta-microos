SUMMARY = "Dependencies to build ghc"
DESCRIPTION = "Prebuild alex and happy for bootstrapping the proper ghc build. \
Don't use outside of GHC bootstrapping!"
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-bootstrap-helpers-1.3-3.1.aarch64.rpm"
RPM_HASH = "918c4e91a996f1c30d7b5d9b35f993b0a8960f1a598f044004108d4d22b866d1a8fe875d8052927ccbb13f5008b7792d9f4056728a9d133b415323e695c4cb9f"

RPROVIDES:${PN} += "ghc-bootstrap-helpers"

RDEPENDS:${PN} += "libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
this-is-only-for-build-envs"

inherit rpm
