SUMMARY = "Haskell reflection library development files"
DESCRIPTION = "This package provides the Haskell reflection library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.7"

RPM_NAME = "ghc-reflection-devel-2.1.7-1.3.aarch64.rpm"
RPM_HASH = "a04a38012e8d9316b598fe33656e420a3e587ae22680727be2c528c9f47afa5cc21e9e1b418db266ae724982974dfd1531a2996d536c7827b49d1b0c11130db8"

RPROVIDES:${PN} += "ghc-devel-reflection-2.1.7-1WygFxHmxkcEQBv8T6gHut \
ghc-reflection-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-reflection"

inherit rpm
