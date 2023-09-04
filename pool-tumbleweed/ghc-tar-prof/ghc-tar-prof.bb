SUMMARY = "Haskell tar profiling library"
DESCRIPTION = "This package provides the Haskell tar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-prof-0.5.1.1-11.8.aarch64.rpm"
RPM_HASH = "88405709748ecbe52815a65853a1479ffeadf4f278eb2a418d2a4045d6d6dca2dc98e072d29d8de6670b1efa9e53a09a5e70514c9ec99ddc14a2ee4129ae8f19"

RPROVIDES:${PN} += "ghc-prof-tar-0.5.1.1-BRnIdFAlm3x9T54VHtqjP6 \
ghc-tar-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2 \
ghc-tar-devel"

inherit rpm
