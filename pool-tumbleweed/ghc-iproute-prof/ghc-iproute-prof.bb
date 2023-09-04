SUMMARY = "Haskell iproute profiling library"
DESCRIPTION = "This package provides the Haskell iproute profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.12"

RPM_NAME = "ghc-iproute-prof-1.7.12-2.9.aarch64.rpm"
RPM_HASH = "fd4af2b8e45069e62c751029a9c541dc2f212e61ea21984778ce299f65e45766316388f3e9e2bd78194b670c229468a4ce37f12a568c3a4fbd9285108a5d5084"

RPROVIDES:${PN} += "ghc-iproute-prof \
ghc-prof-iproute-1.7.12-A34D1N9dJmL5ps3agDCHa7"

RDEPENDS:${PN} += "ghc-iproute-devel \
ghc-prof-appar-0.1.8-1lWb1vtDAvc6rz1D87iAo \
ghc-prof-base-4.17.2.0 \
ghc-prof-byteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs"

inherit rpm
