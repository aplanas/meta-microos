SUMMARY = "Haskell disk-free-space profiling library"
DESCRIPTION = "This package provides the Haskell disk-free-space profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-prof-0.1.0.1-5.3.aarch64.rpm"
RPM_HASH = "f0f6d53d56b89a4f71ee73363d8dfc3c0281264aad8cda6869cf197ecf61fb125b5e8e6cd03c9e4d39805bd9b53ede58bb7ad1ecd237049c7a3bfacd621bd0cd"

RPROVIDES:${PN} += "ghc-disk-free-space-prof \
ghc-prof-disk-free-space-0.1.0.1-3IatejMIAz9HNNNelqKH6x"

RDEPENDS:${PN} += "ghc-disk-free-space-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
