SUMMARY = "Haskell network library development files"
DESCRIPTION = "This package provides the Haskell network library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.2.8"

RPM_NAME = "ghc-network-devel-3.1.2.8-1.3.aarch64.rpm"
RPM_HASH = "f8d71b79db294fb3e4d818124abfc909c928d8f714b02b2d88b2c4165aa7dcd6390f674281dfba909ca1e7c2ce7c9e80b80811a440698126b16709a25342c3e9"

RPROVIDES:${PN} += "ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) \
ghc-network-devel \
ghc-network-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(directory-1.3.7.1) \
ghc-network"

inherit rpm
