SUMMARY = "Haskell invariant library development files"
DESCRIPTION = "This package provides the Haskell invariant library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-invariant-devel-0.6.1-1.6.aarch64.rpm"
RPM_HASH = "71a774e146b1e67184138e18c480d713b19c41bc2caeddca9273ea0a55de2b58f3dc9cf26b5e23b92b0e441f273a0364dc7ab462183ac286ace602f19dffd1c0"

RPROVIDES:${PN} += "ghc-devel-invariant-0.6.1-B19sct74tP6Cqvpbmm6WZv \
ghc-invariant-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-StateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bifunctors-5.5.15-7mn3oj93MLM2f6K5DVlnRL \
ghc-devel-comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4 \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-profunctors-5.6.2-BxPEMLImcM1AGaSfWljpGV \
ghc-devel-stm-2.5.1.0 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-abstraction-0.4.5.0-8bY5lBPMorfFW3yG6gFNZT \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-invariant"

inherit rpm
