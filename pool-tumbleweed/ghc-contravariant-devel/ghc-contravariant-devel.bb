SUMMARY = "Haskell contravariant library development files"
DESCRIPTION = "This package provides the Haskell contravariant library development files."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-devel-1.5.5-2.3.aarch64.rpm"
RPM_HASH = "728de225375873a651173a2313dc6ba1b64c403088914a7b2aa52823c99725abfa8a106e41c7affa72905bd1720044a7a045c209371ec62fd3553e9f5ddc6a31"

RPROVIDES:${PN} += "ghc-contravariant-devel \
ghc-devel-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-contravariant \
ghc-devel-StateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN \
ghc-devel-base-4.17.1.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
