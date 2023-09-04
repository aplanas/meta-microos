SUMMARY = "Haskell cipher-aes profiling library"
DESCRIPTION = "This package provides the Haskell cipher-aes profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-prof-0.2.11-4.5.aarch64.rpm"
RPM_HASH = "d68a233615e41cf2a3e3e8ed24aeb30e5f5dd9b390a6e2ccc75c9583bfaa35de62fecafe4b708d09322ba35bba1261a9b94fe1bcaed77dcc0bdda2d55287eae3"

RPROVIDES:${PN} += "ghc-cipher-aes-prof \
ghc-prof-cipher-aes-0.2.11-J6Bfrfqg5Tl79OIpP67OVG"

RDEPENDS:${PN} += "ghc-cipher-aes-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-crypto-cipher-types-0.0.9-6FlBjXMHauN3ENUNZLdeKl \
ghc-prof-securemem-0.1.10-HwgHwfqNrQFCVsnPOu3Pz4"

inherit rpm
