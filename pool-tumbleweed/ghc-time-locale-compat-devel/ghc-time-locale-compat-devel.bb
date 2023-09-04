SUMMARY = "Haskell time-locale-compat library development files"
DESCRIPTION = "This package provides the Haskell time-locale-compat library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.5"

RPM_NAME = "ghc-time-locale-compat-devel-0.1.1.5-7.3.aarch64.rpm"
RPM_HASH = "3b88be046688845d09f78d7283cab0ccca4a6738cabe5b95257aac32eee88f07c2b3711a037a17078536afece05020d8ea059142929efc95a675c4c8450baba3"

RPROVIDES:${PN} += "ghc-devel-time-locale-compat-0.1.1.5-9kgo2YphD9418bVnFGy98u \
ghc-time-locale-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-time-1.12.2 \
ghc-time-locale-compat"

inherit rpm
