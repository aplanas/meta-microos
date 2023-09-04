SUMMARY = "Haskell postgresql-simple library development files"
DESCRIPTION = "This package provides the Haskell postgresql-simple library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.6.5.1"

RPM_NAME = "ghc-postgresql-simple-devel-0.6.5.1-1.4.aarch64.rpm"
RPM_HASH = "143ff01a9a6108c55c2838894571873e21f51271efb74b2c7b40fb4958c4a2c1b1c4c13488bbc67d3b40dea820e12f1d54af60c435c4cbf0bb59b0ff0e692824"

RPROVIDES:${PN} += "ghc-devel-postgresql-simple-0.6.5.1-1VNm6CFaKplLWGwA33lD3u \
ghc-postgresql-simple-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Only-0.1-qCrN026ulaL2ZFxnlcrV1 \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-postgresql-libpq-0.9.5.0-LAEYJt6pIENHmjvWelVvQG \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-compat-1.9.6.1-J6qzCGPCWqPGQqFFbCQAYM \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-postgresql-simple"

inherit rpm
