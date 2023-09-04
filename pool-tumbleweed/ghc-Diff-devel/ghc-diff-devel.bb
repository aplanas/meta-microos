SUMMARY = "Haskell Diff library development files"
DESCRIPTION = "This package provides the Haskell Diff library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-devel-0.4.1-2.8.aarch64.rpm"
RPM_HASH = "2118f4bdbd585cd0570510a2277cd247e880e046907dfb3173db38f58ca60e1d129372f28273f9947a6e2db18bc140028589b5577af31a0503b066cd57e93095"

RPROVIDES:${PN} += "ghc-Diff-devel \
ghc-devel-Diff-0.4.1-LhFtxwvuVVqGkTz0Ph6iJg"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Diff \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-pretty-1.1.3.6"

inherit rpm
