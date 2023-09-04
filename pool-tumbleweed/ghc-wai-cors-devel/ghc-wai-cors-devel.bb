SUMMARY = "Haskell wai-cors library development files"
DESCRIPTION = "This package provides the Haskell wai-cors library development files."
LICENSE = "MIT"

PV = "0.2.7"

RPM_NAME = "ghc-wai-cors-devel-0.2.7-1.5.aarch64.rpm"
RPM_HASH = "15430d3bb7447cea5ddccdf740249fa209b96f1cf40c051eaddd7971a76d05ebaa5a916a73471c9646c1b184297584f5f7a43511e4bdb051bc72bdb634c4368e"

RPROVIDES:${PN} += "ghc-devel-wai-cors-0.2.7-J2u6IKYmeDEH7p5Hhrx22i \
ghc-wai-cors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-unicode-symbols-0.2.4.2-AsBlETXXS2UHsp6FZL7O0P \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-mtl-2.2.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-wai-cors"

inherit rpm
