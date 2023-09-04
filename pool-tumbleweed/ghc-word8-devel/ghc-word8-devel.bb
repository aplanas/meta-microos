SUMMARY = "Haskell word8 library development files"
DESCRIPTION = "This package provides the Haskell word8 library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-devel-0.1.3-5.8.aarch64.rpm"
RPM_HASH = "5481e931af3df04ed46684a5469f35e7775307bee90b0b7145becf23b26046bcbc94bab1831eb5a727f139ff61bd637b1c55d51b9a9215cdda745556768fab59"

RPROVIDES:${PN} += "ghc-devel-word8-0.1.3-DFPYFbOkkGxAoNpsP1UPBD \
ghc-word8-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-word8"

inherit rpm
