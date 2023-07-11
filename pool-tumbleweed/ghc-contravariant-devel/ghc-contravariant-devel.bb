SUMMARY = "Haskell contravariant library development files"
DESCRIPTION = "This package provides the Haskell contravariant library development files."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-devel-1.5.5-2.6.aarch64.rpm"
RPM_HASH = "14e8508a145df241b673d3f6c28fe8e7e1408c1813e8480285977b14c4f0afdf9716e189efbc2d0bc048e94e85a6ac8b42e90f13122e376b5f04eed9fd9efb8e"

RPROVIDES:${PN} += "ghc-contravariant-devel \
ghc-devel-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-contravariant \
ghc-devel-StateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN \
ghc-devel-base-4.17.1.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
