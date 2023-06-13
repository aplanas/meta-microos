SUMMARY = "Haskell shakespeare profiling library"
DESCRIPTION = "This package provides the Haskell shakespeare profiling library."
LICENSE = "MIT"

PV = "2.0.30"

RPM_NAME = "ghc-shakespeare-prof-2.0.30-2.3.aarch64.rpm"
RPM_HASH = "65950145ef82e7334a15380e046c1922653b3a5a8dbf4f5f4bd1ec5f84ec70f84627fb742c2ce873c53ee0b9b2e1461b6469247b1e6b69bf621e725ec3aef33a"

RPROVIDES:${PN} += "ghc-prof(shakespeare-2.0.30-7fp9544x1BC4UOjjHLrTv0) \
ghc-shakespeare-prof \
ghc-shakespeare-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(base-4.17.1.0) \
ghc-prof(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR) \
ghc-prof(blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(process-1.6.16.0) \
ghc-prof(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(text-2.0.2) \
ghc-prof(th-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN) \
ghc-prof(time-1.12.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-shakespeare-devel"

inherit rpm
