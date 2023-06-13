SUMMARY = "Haskell async library development files"
DESCRIPTION = "This package provides the Haskell async library development files."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "ghc-async-devel-2.2.4-4.2.aarch64.rpm"
RPM_HASH = "d8c17ab6327fafb2c74c2fc06431f9fd6ea1660506d041a31a65928fcef35f95c9e468f2b462125e3bdbdddb7ee62161789692892e90aa68b4db062f5bc650f4"

RPROVIDES:${PN} += "ghc-async-devel \
ghc-async-devel(aarch-64) \
ghc-devel(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF)"

RDEPENDS:${PN} += "/bin/sh \
ghc-async \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-devel(stm-2.5.1.0)"

inherit rpm
