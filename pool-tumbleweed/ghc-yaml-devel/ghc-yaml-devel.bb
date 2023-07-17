SUMMARY = "Haskell yaml library development files"
DESCRIPTION = "This package provides the Haskell yaml library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.2"

RPM_NAME = "ghc-yaml-devel-0.11.11.2-1.1.aarch64.rpm"
RPM_HASH = "362ea6adadbc321d5d09285eeb944fcc167a12208e7ca32df06118d7699fd5df566d6365290a8ffd6766ef9aca57ecbbc8d053e1595c5992f659c92610bead3a"

RPROVIDES:${PN} += "ghc-devel-yaml-0.11.11.2-4GYYolDKkXn5x4zdb9DA59 \
ghc-yaml-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-libyaml-0.1.2-6Gx0z1LjMeG6dZCnkkkmHj \
ghc-devel-mtl-2.2.2 \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-yaml"

inherit rpm
