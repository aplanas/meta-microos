SUMMARY = "Haskell network-info profiling library"
DESCRIPTION = "This package provides the Haskell network-info profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-prof-0.2.1-2.2.aarch64.rpm"
RPM_HASH = "8056b0d0d707ae2ba6981bf9c5862f04beede3699dd5178837dcb14617a1476846f35c4794f800cd348fdc67305104eea16d2fc64c6a044626818a76fff41052"

RPROVIDES:${PN} += "ghc-network-info-prof \
ghc-prof-network-info-0.2.1-G9nMDkAKQecAEHIupCmq9I"

RDEPENDS:${PN} += "ghc-network-info-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
