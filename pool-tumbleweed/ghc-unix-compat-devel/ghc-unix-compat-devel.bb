SUMMARY = "Haskell unix-compat library development files"
DESCRIPTION = "This package provides the Haskell unix-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-devel-0.6-3.3.aarch64.rpm"
RPM_HASH = "8f4c000a3d93c32578c9a9f783adc15391e06a20cf9e5abb96b0dedc7eb46e82f4d2e176d8282d9cb89a6a66c4ab452d7bf7d5d204bc0f34dce020f7cf4ab5ce"

RPROVIDES:${PN} += "ghc-devel-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-unix-compat-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-unix-2.7.3 \
ghc-unix-compat"

inherit rpm
