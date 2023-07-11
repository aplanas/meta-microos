SUMMARY = "Haskell base-compat library development files"
DESCRIPTION = "This package provides the Haskell base-compat library development files."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "ghc-base-compat-devel-0.13.0-1.3.aarch64.rpm"
RPM_HASH = "97b46145efe710a53f8edcdc9aa4cd17f1df55a0ab1bbc20b5f9057aa352ddc7e5a6118cebfbb408a0597d37121872901237ca861759924992322d7d1194cf85"

RPROVIDES:${PN} += "ghc-base-compat-devel \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base-compat \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-unix-2.7.3"

inherit rpm
