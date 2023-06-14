SUMMARY = "Haskell sandi profiling library"
DESCRIPTION = "This package provides the Haskell sandi profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-sandi-prof-0.5-5.3.aarch64.rpm"
RPM_HASH = "1d853800c64fa21d141d5c8a260e06cf6412eb5a3fb02a7cfbe5bc06fbde5533ff11d8c7c3798f5036e82149269d41a5994c71366814217f343317a60f85b415"

RPROVIDES:${PN} += "ghc-prof-sandi-0.5-G6Jka3yQQG77V9ypm6cnaU \
ghc-sandi-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2 \
ghc-prof-exceptions-0.10.5 \
ghc-sandi-devel"

inherit rpm
