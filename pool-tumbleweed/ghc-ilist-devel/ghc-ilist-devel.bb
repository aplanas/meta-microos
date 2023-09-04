SUMMARY = "Haskell ilist library development files"
DESCRIPTION = "This package provides the Haskell ilist library development files."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-ilist-devel-0.4.0.1-2.1.aarch64.rpm"
RPM_HASH = "31314c2abea7090f0ab0727046c352fb3ec88d36eef9e04ff73b15fc302956c74d636515d1ee666265dc49b952956c4346b23ef25e5abaa7e51c0909b308a880"

RPROVIDES:${PN} += "ghc-devel-ilist-0.4.0.1-9dvbAvSibn3BQOkPCJFvsJ \
ghc-ilist-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-ilist"

inherit rpm
