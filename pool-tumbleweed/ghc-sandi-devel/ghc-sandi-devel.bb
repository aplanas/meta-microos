SUMMARY = "Haskell sandi library development files"
DESCRIPTION = "This package provides the Haskell sandi library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-devel-0.5-5.3.aarch64.rpm"
RPM_HASH = "b591562626910373d123274c26557f8c5a9bff2c4f94f4e28c3a69ec05fa149de4f727a4554b811827dc72d4dcbb47569f253d0e8b747daa3ea37b9b9dea33cf"

RPROVIDES:${PN} += "ghc-devel(sandi-0.5-G6Jka3yQQG77V9ypm6cnaU) \
ghc-sandi-devel \
ghc-sandi-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(exceptions-0.10.5) \
ghc-sandi"

inherit rpm
