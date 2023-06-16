SUMMARY = "Haskell gitrev library development files"
DESCRIPTION = "This package provides the Haskell gitrev library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-gitrev-devel-1.3.1-9.2.aarch64.rpm"
RPM_HASH = "3d0d98ac51d20a36ebd136e32b2ca284173a42e1d20df3f0c00b42848a56f40872a160f430941dc5ce074fcbaaef6df81e806cef3ed9f7051d1697d3fd490609"

RPROVIDES:${PN} += "ghc-devel-gitrev-1.3.1-Fh7rxVehK3vCpE8f2RFTGz \
ghc-gitrev-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-gitrev"

inherit rpm
