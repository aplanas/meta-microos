SUMMARY = "Haskell connection profiling library"
DESCRIPTION = "This package provides the Haskell connection profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-connection-prof-0.3.1-8.3.aarch64.rpm"
RPM_HASH = "5e6bbecec3158b80c36a05b10e425106fd17d7e1947f1dbb81825c68e0eb3a450033d83835806f35ed0c0a79d8da3b59dc094a99e5a9b68c0498ee68b6213794"

RPROVIDES:${PN} += "ghc-connection-prof \
ghc-prof-connection-0.3.1-HritGhbYIMl4OD06E3KY8G"

RDEPENDS:${PN} += "ghc-connection-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-socks-0.6.1-5RVEIbYAf8qJqchdUVHVHw \
ghc-prof-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-prof-x509-1.7.7-2oKbMm4GXJUL45OKqbcDfn \
ghc-prof-x509-store-1.6.9-LlMGA7EC0Rw1u8xijDLJr9 \
ghc-prof-x509-system-1.6.7-1XvIorlhEdrAudn5lZUzwY \
ghc-prof-x509-validation-1.6.12-2BCfCxJkKCuIEN8YGAOqI4"

inherit rpm
