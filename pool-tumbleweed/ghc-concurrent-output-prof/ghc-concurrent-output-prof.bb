SUMMARY = "Haskell concurrent-output profiling library"
DESCRIPTION = "This package provides the Haskell concurrent-output profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.10.19"

RPM_NAME = "ghc-concurrent-output-prof-1.10.19-1.1.aarch64.rpm"
RPM_HASH = "d9d80efeceebda44cd65770ab7805e3a384f3ef27a76a9c3baf21001e8073cf73aa9a80f3d6886a7bab2d84f448a815058922fa21042e6f1620653f94f7b1296"

RPROVIDES:${PN} += "ghc-concurrent-output-prof \
ghc-prof-concurrent-output-1.10.19-EkNYg3t67vm7EieVPINblU"

RDEPENDS:${PN} += "ghc-concurrent-output-devel \
ghc-prof-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-process-1.6.17.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-terminal-size-0.3.4-3vDBLsxBXgoFiFoFBqm3N8 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
