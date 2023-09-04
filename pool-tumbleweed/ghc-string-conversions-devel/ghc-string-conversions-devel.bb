SUMMARY = "Haskell string-conversions library development files"
DESCRIPTION = "This package provides the Haskell string-conversions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-string-conversions-devel-0.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "ed1160bcefdac8e6f754de6a68cc3063e6d53e9677b537ec5a930c81ebcb770113e2564558d7b81953c1a8a710a375458604979b69ff8a2cd6d6b747ddadd342"

RPROVIDES:${PN} += "ghc-devel-string-conversions-0.4.0.1-3N7tba7YAcNAKUMLxg4Ink \
ghc-string-conversions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2 \
ghc-devel-utf8-string-1.0.2-26mnfHz4IgtDU2rLQciXDs \
ghc-string-conversions"

inherit rpm
