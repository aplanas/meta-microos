SUMMARY = "Haskell xml-hamlet profiling library"
DESCRIPTION = "This package provides the Haskell xml-hamlet profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.2"

RPM_NAME = "ghc-xml-hamlet-prof-0.5.0.2-2.3.aarch64.rpm"
RPM_HASH = "c4af67ac3962ba7b53fc4d5eb157f4f1e117b8a02e19c18ff2ad1dcfc33393c3ac243e7f10f992e9e343407d9d55e43210370923eb101c6046a8f7829981836f"

RPROVIDES:${PN} += "ghc-prof(xml-hamlet-0.5.0.2-IdxjO6rnbTj7Ym5G4XopFP) \
ghc-xml-hamlet-prof \
ghc-xml-hamlet-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(shakespeare-2.0.30-7fp9544x1BC4UOjjHLrTv0) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(text-2.0.2) \
ghc-prof(xml-conduit-1.9.1.2-EG4w0oWu477B6XYo8w0Zz4) \
ghc-xml-hamlet-devel"

inherit rpm
