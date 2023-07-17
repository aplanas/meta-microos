SUMMARY = "Haskell yaml profiling library"
DESCRIPTION = "This package provides the Haskell yaml profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.2"

RPM_NAME = "ghc-yaml-prof-0.11.11.2-1.1.aarch64.rpm"
RPM_HASH = "a5b19740060982905623107537db30b3f596bf9c6dbc4e823658e0842aa300075f38de244fd0605fe0a936b890d598617658b525ebf1f2a1195f604c7ed3655d"

RPROVIDES:${PN} += "ghc-prof-yaml-0.11.11.2-4GYYolDKkXn5x4zdb9DA59 \
ghc-yaml-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-libyaml-0.1.2-6Gx0z1LjMeG6dZCnkkkmHj \
ghc-prof-mtl-2.2.2 \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-yaml-devel"

inherit rpm
