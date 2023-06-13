SUMMARY = "Haskell fast-logger library development files"
DESCRIPTION = "This package provides the Haskell fast-logger library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.2"

RPM_NAME = "ghc-fast-logger-devel-3.1.2-1.3.aarch64.rpm"
RPM_HASH = "f8c72c5c9d9143af83c140de2b598dac850b8c12ede545d88889bfc17549ac960917a05f8daa0e2837b21176ad1db6be2f0172671333cfc375e71dcecd2a132f"

RPROVIDES:${PN} += "ghc-devel(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) \
ghc-fast-logger-devel \
ghc-fast-logger-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(easy-file-0.2.3-Bwh7vXkS9r2GpL1fsuKjo4) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(text-2.0.2) \
ghc-devel(unix-compat-0.6-79KxxZMmklx25hsmeEnenN) \
ghc-devel(unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0) \
ghc-fast-logger"

inherit rpm
