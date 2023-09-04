SUMMARY = "Haskell old-locale profiling library"
DESCRIPTION = "This package provides the Haskell old-locale profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.7"

RPM_NAME = "ghc-old-locale-prof-1.0.0.7-13.3.aarch64.rpm"
RPM_HASH = "4e5ac7cf0ceafe3372d686954da94a2746523bca6b9fcf87e8d4127cae1d2323393a46d7f55e00b0f8277034f7825beb2bb32bcc4cd26c821077f78d1db4ebcd"

RPROVIDES:${PN} += "ghc-old-locale-prof \
ghc-prof-old-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk"

RDEPENDS:${PN} += "ghc-old-locale-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
