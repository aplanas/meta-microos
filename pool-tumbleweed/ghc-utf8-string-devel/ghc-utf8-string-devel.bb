SUMMARY = "Haskell utf8-string library development files"
DESCRIPTION = "This package provides the Haskell utf8-string library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-devel-1.0.2-2.8.aarch64.rpm"
RPM_HASH = "c0a83f88dd228006b79d1a73d41b0c690a1695fface0d7caf430593879257ad1660c0035fe30f33f4ca674fa424e66c476fdaaee9b5a97c602420b3504860795"

RPROVIDES:${PN} += "ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-utf8-string-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-utf8-string"

inherit rpm
