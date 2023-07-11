SUMMARY = "Haskell yaml library development files"
DESCRIPTION = "This package provides the Haskell yaml library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.1"

RPM_NAME = "ghc-yaml-devel-0.11.11.1-1.2.aarch64.rpm"
RPM_HASH = "b668c7e474368bf5d96542a117ad413c96d597800d09b7839c1c60912ca7c600a13e199cfc001c1dca9367da6a057fd958f2d1c91106ddce5bfe5751e51ec091"

RPROVIDES:${PN} += "ghc-devel-yaml-0.11.11.1-3T1xu4983kFHb1qERRZhqW \
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
