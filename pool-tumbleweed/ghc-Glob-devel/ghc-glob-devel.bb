SUMMARY = "Haskell Glob library development files"
DESCRIPTION = "This package provides the Haskell Glob library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "ghc-Glob-devel-0.10.2-3.6.aarch64.rpm"
RPM_HASH = "3dc04135a635936c32bb3a407b218f165074131e1abb59c6dee18e75051c5dc49e80b0ea2840d5298bdacb788ffc5dbf8e290ef1eecc83d32260fd879bafffdb"

RPROVIDES:${PN} += "ghc-Glob-devel \
ghc-devel-Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Glob \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-dlist-1.0-BmTLN13CmmLQvuHz7BjP9 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd"

inherit rpm
