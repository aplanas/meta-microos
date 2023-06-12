SUMMARY = "Haskell bencode profiling library"
DESCRIPTION = "This package provides the Haskell bencode profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.1"

RPM_NAME = "ghc-bencode-prof-0.6.1.1-4.3.aarch64.rpm"
RPM_HASH = "ab4e593f3adf164cfb896d54449528ecc43cdb42fc0d90415859aecfc3889bfefda91811963b3958f249cb571649f87ec7e41df012d1effa25499ee40a734876"

RPROVIDES:${PN} += "ghc-bencode-prof \
ghc-bencode-prof(aarch-64) \
ghc-prof(bencode-0.6.1.1-GM7FbH3LNxfAWaUPR0lH5w)"
RDEPENDS:${PN} += "ghc-bencode-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
