SUMMARY = "Haskell parsec-numbers library development files"
DESCRIPTION = "This package provides the Haskell parsec-numbers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-devel-0.1.0-7.3.aarch64.rpm"
RPM_HASH = "2790791fb41f4d8f69543371869e2a64f95b59c1d3e08f198a2f058ce7b71f64002b831177748c409d81fa96c01414fd129f094697bfc15990fe5a7d3b4a9726"

RPROVIDES:${PN} += "ghc-devel-parsec-numbers-0.1.0-JmfSOl7TbABbRzQTrD74l \
ghc-parsec-numbers-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-parsec-3.1.16.1 \
ghc-parsec-numbers"

inherit rpm
