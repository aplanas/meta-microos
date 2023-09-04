SUMMARY = "Haskell tasty-hunit library development files"
DESCRIPTION = "This package provides the Haskell tasty-hunit library development files."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-devel-0.10.0.3-2.5.aarch64.rpm"
RPM_HASH = "0e496a00e22f13f1e3a746839febc190ea10c6c735d856e0dcab3ffae2283b08e2cf341692f42c940aaaaf946ba7787852e79794c2c60ad4b84e33076314363d"

RPROVIDES:${PN} += "ghc-devel-tasty-hunit-0.10.0.3-2hefb6clI09Drjkc6dw6d8 \
ghc-tasty-hunit-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-call-stack-0.4.0-nQZfFxinEdIa1BWxMyadt \
ghc-devel-tasty-1.4.3-EvDBAB3nA5D6U1ANfXkHR \
ghc-tasty-hunit"

inherit rpm
