SUMMARY = "Haskell yaml library development files"
DESCRIPTION = "This package provides the Haskell yaml library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.0"

RPM_NAME = "ghc-yaml-devel-0.11.11.0-1.3.aarch64.rpm"
RPM_HASH = "61421a69d018a1dca755c107a0dda086a8ed5b5f96d97f8c30e840e2d52ebacced61b862f7b078dd04190a313362bccda6a7c916a484f7574a1640098f61294c"

RPROVIDES:${PN} += "ghc-devel(yaml-0.11.11.0-AM27xwJeGq9DNHRH5iLzHi) \
ghc-yaml-devel \
ghc-yaml-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(containers-0.6.7) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(libyaml-0.1.2-HGo47aMnIYAKZUBwKE0axw) \
ghc-devel(mtl-2.2.2) \
ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-devel(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-yaml"

inherit rpm
