SUMMARY = "Haskell doclayout library development files"
DESCRIPTION = "This package provides the Haskell doclayout library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-doclayout-devel-0.4.0.1-1.2.aarch64.rpm"
RPM_HASH = "2c71dbae65544e9855be80df8527d2f728657b61df986948c30c71eb483e0afac5cf20d437f7b5b2233da6bcba968bbadbe91c06cb0e6351e73df2eb7f309e2e"

RPROVIDES:${PN} += "ghc-devel(doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0) ghc-doclayout-devel ghc-doclayout-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm) ghc-devel(mtl-2.2.2) ghc-devel(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) ghc-devel(text-2.0.2) ghc-doclayout"

inherit rpm
