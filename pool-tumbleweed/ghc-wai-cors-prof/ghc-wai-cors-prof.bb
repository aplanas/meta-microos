SUMMARY = "Haskell wai-cors profiling library"
DESCRIPTION = "This package provides the Haskell wai-cors profiling library."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-prof-0.2.7-1.5.aarch64.rpm"
RPM_HASH = "9b3f03bfba3dc6161c410f656a06357d42911b90a3261ee3de24d119d8232ad02823bd45959b773e8cf6f86744282ddbcde75079e7354673f5ec0b0dba0f3acd"

RPROVIDES:${PN} += "ghc-prof-wai-cors-0.2.7-J2u6IKYmeDEH7p5Hhrx22i \
ghc-wai-cors-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base-unicode-symbols-0.2.4.2-AsBlETXXS2UHsp6FZL7O0P \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-mtl-2.2.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-wai-cors-devel"

inherit rpm
