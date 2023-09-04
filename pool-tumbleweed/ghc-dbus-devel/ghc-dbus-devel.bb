SUMMARY = "Haskell dbus library development files"
DESCRIPTION = "This package provides the Haskell dbus library development files."
LICENSE = "Apache-2.0"

PV = "1.2.29"

RPM_NAME = "ghc-dbus-devel-1.2.29-1.7.aarch64.rpm"
RPM_HASH = "17169f5bea84437251c2a2ea3caad3000750e153818bd44bc20a2b3b516fcc548b7790165811674d8f4cc569fc5bdff60094aa416feda7dde79747cd3b7cbf82"

RPROVIDES:${PN} += "ghc-dbus-devel \
ghc-devel-dbus-1.2.29-AAIySIFW0zz7mxLdRwt0V6"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-dbus \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-lens-5.2.2-9FQiMfULngUCqLz60VkKPe \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-devel-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6"

inherit rpm
