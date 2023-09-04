SUMMARY = "Haskell dbus profiling library"
DESCRIPTION = "This package provides the Haskell dbus profiling library."
LICENSE = "Apache-2.0"

PV = "1.2.29"

RPM_NAME = "ghc-dbus-prof-1.2.29-1.7.aarch64.rpm"
RPM_HASH = "af0e39d1171a1e45640e853303be0071d4c833a2829ac6a381a3033e028e7b223004387954809e9da0bab7cbb899f0572512b631742371752e3b119878af6fd5"

RPROVIDES:${PN} += "ghc-dbus-prof \
ghc-prof-dbus-1.2.29-AAIySIFW0zz7mxLdRwt0V6"

RDEPENDS:${PN} += "ghc-dbus-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-cereal-0.5.8.3-BmWUcZuhGTnIupxReuIO3I \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-lens-5.2.2-9FQiMfULngUCqLz60VkKPe \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9 \
ghc-prof-xml-types-0.3.8-8dFL1RqlGPRJfvDIVn7kl6"

inherit rpm
