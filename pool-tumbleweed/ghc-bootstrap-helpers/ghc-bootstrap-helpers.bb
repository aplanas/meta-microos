SUMMARY = "Dependencies to build ghc"
DESCRIPTION = "Prebuild alex and happy for bootstrapping the proper ghc build. \
Don't use outside of GHC bootstrapping!"
LICENSE = "BSD-3-Clause & BSD-2-Clause"

PV = "1.3"

RPM_NAME = "ghc-bootstrap-helpers-1.3-1.1.aarch64.rpm"
RPM_HASH = "ddb18531835cbe829403e7a1c93cd8b6ce37c44df8af2d61548d374fda9441490ad5758484bce6a864955036dfb406afced7dbf105f2164d8e36e8e97ea6dc32"

RPROVIDES:${PN} += "ghc-bootstrap-helpers"

RDEPENDS:${PN} += "libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
this-is-only-for-build-envs"

inherit rpm
