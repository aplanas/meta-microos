SUMMARY = "Haskell Glob profiling library"
DESCRIPTION = "This package provides the Haskell Glob profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-prof-0.10.2-3.6.aarch64.rpm"
RPM_HASH = "1f2df2cbec0131bfd77abb153cf6b082be8ba1cc86668f9b311cd21264b15640673227ca461115fdb32ad2d5f13636fc6a5c34e4aec5837f3fbb1da47f368db2"

RPROVIDES:${PN} += "ghc-Glob-prof \
ghc-prof-Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R"

RDEPENDS:${PN} += "ghc-Glob-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-dlist-1.0-BmTLN13CmmLQvuHz7BjP9 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd"

inherit rpm
