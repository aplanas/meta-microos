SUMMARY = "Haskell libmpd profiling library"
DESCRIPTION = "This package provides the Haskell libmpd profiling library."
LICENSE = "MIT"

PV = "0.10.0.0"

RPM_NAME = "ghc-libmpd-prof-0.10.0.0-2.8.aarch64.rpm"
RPM_HASH = "610bc6e2d3800202bf38c5e1f0e94ffb63df082601365da908f6cf5191b45a29beac6b52c3317c370e67a528f31ddf7cf132ba1c861dde3dd3ec4e6424f1d43f"

RPROVIDES:${PN} += "ghc-libmpd-prof \
ghc-prof-libmpd-0.10.0.0-1mRX9TQl9aY4gH6teXbpki"

RDEPENDS:${PN} += "ghc-libmpd-devel \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc \
ghc-prof-safe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q"

inherit rpm
