SUMMARY = "Haskell iproute profiling library"
DESCRIPTION = "This package provides the Haskell iproute profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-prof-1.7.12-2.7.aarch64.rpm"
RPM_HASH = "8d1b1fdcc66d9acc7666ec494d442644870d56fc80c22c910b2dfb55320f782648072bb69dc2b5a10cea9f729f662fe1e9513f08309d7924884d939d16a3426b"

RPROVIDES:${PN} += "ghc-iproute-prof \
ghc-prof-iproute-1.7.12-IhoklPQYItb8qGu1G3vmcD"

RDEPENDS:${PN} += "ghc-iproute-devel \
ghc-prof-appar-0.1.8-JYpyJYPkUOgKorqU8WSWRv \
ghc-prof-base-4.17.1.0 \
ghc-prof-byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc"

inherit rpm
