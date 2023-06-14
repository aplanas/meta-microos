SUMMARY = "Haskell contravariant profiling library"
DESCRIPTION = "This package provides the Haskell contravariant profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-prof-1.5.5-2.3.aarch64.rpm"
RPM_HASH = "7879a9252692b70154590a1c07789c7efd6ea70426672bcb5ce39c72f66305da5a4abb18a58f3397abdcaa6b069784bbe0d9d1ca3099d55bf7bc0ec482fa88e5"

RPROVIDES:${PN} += "ghc-contravariant-prof \
ghc-prof-contravariant-1.5.5-K71YSUvfKnA5wfNaE05Lao"

RDEPENDS:${PN} += "ghc-contravariant-devel \
ghc-prof-StateVar-1.2.2-GlWluWgK8kgE7IUHzo2idN \
ghc-prof-base-4.17.1.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
