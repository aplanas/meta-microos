SUMMARY = "Haskell contravariant library development files"
DESCRIPTION = "This package provides the Haskell contravariant library development files."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-devel-1.5.5-2.8.aarch64.rpm"
RPM_HASH = "df3fb1d68fd66836441804d6e7f15901b3f030610f6c4f006ff7d562735cc837f49c3a72a21dfbafac2fbde63aea92803778f9fca0d27c277a092055b8265739"

RPROVIDES:${PN} += "ghc-contravariant-devel \
ghc-devel-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-contravariant \
ghc-devel-StateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J \
ghc-devel-base-4.17.2.0 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
