SUMMARY = "Haskell resolv profiling library"
DESCRIPTION = "This package provides the Haskell resolv profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.2.0"

RPM_NAME = "ghc-resolv-prof-0.1.2.0-10.8.aarch64.rpm"
RPM_HASH = "b68adbaf4aee5dee5742d5db299b046d0a04e6b885247c81eed80b9a8a73fd2c841d8dbba31ebfd8ce6cec26c785d9896c79f4c29f4d7fdbfbbe6fb844198d9b"

RPROVIDES:${PN} += "ghc-prof-resolv-0.1.2.0-LPfwrdmMO1tC4Sn0ebxMDl \
ghc-resolv-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-resolv-devel"

inherit rpm
