SUMMARY = "Haskell typed-process profiling library"
DESCRIPTION = "This package provides the Haskell typed-process profiling library."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-prof-0.2.11.0-1.6.aarch64.rpm"
RPM_HASH = "03d89670889c593ceb50de0ac3d692506930ea97cbf87dbba217a3b58133890212642871f91df87e17938c540a8992280915b99609f0579e04f2222cfb9d56ee"

RPROVIDES:${PN} += "ghc-prof-typed-process-0.2.11.0-AJYHFlIHznQBMeAWc6SvCO \
ghc-typed-process-prof"

RDEPENDS:${PN} += "ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-process-1.6.16.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj \
ghc-typed-process-devel"

inherit rpm
