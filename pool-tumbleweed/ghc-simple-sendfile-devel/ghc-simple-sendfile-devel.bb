SUMMARY = "Haskell simple-sendfile library development files"
DESCRIPTION = "This package provides the Haskell simple-sendfile library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.32"

RPM_NAME = "ghc-simple-sendfile-devel-0.2.32-1.4.aarch64.rpm"
RPM_HASH = "13c7b3fdd37725d97b366746a6a454417a8cf1b37747c8358e9c871f3c700ffd3a33e950c45f35303440da03bf96f901c3c5e081f4dae5c2a3c76d8cb974d51f"

RPROVIDES:${PN} += "ghc-devel-simple-sendfile-0.2.32-Jkz6BAomm8GAcovJHWebTs \
ghc-simple-sendfile-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-unix-2.7.3 \
ghc-simple-sendfile"

inherit rpm
