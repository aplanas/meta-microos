SUMMARY = "Haskell http-date library development files"
DESCRIPTION = "This package provides the Haskell http-date library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-devel-0.0.11-2.6.aarch64.rpm"
RPM_HASH = "eeda6b50b82da4048aee80e34e688bf27666dabe23834dfea5d0c0b0bef85926c9b41abdeba042190f30c35e0b1f6c4e3afccd370971ba0747174e7315858edb"

RPROVIDES:${PN} += "ghc-devel-http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD \
ghc-http-date-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-time-1.12.2 \
ghc-http-date"

inherit rpm
