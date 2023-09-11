SUMMARY = "Haskell concurrent-output library development files"
DESCRIPTION = "This package provides the Haskell concurrent-output library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.10.19"

RPM_NAME = "ghc-concurrent-output-devel-1.10.19-1.1.aarch64.rpm"
RPM_HASH = "95ef230bf996aba0eb531ea6163b28ae20f82de451a80befcf4c50e0f593b0022154cdab7af3623659b672de64b0074fead3545cd0d4e146ee6b9692e63f9bae"

RPROVIDES:${PN} += "ghc-concurrent-output-devel \
ghc-devel-concurrent-output-1.10.19-EkNYg3t67vm7EieVPINblU"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-concurrent-output \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-process-1.6.17.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-terminal-size-0.3.4-3vDBLsxBXgoFiFoFBqm3N8 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3"

inherit rpm
