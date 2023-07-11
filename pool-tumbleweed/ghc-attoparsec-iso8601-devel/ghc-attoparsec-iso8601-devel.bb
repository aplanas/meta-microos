SUMMARY = "Haskell attoparsec-iso8601 library development files"
DESCRIPTION = "This package provides the Haskell attoparsec-iso8601 library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.1.0.0"

RPM_NAME = "ghc-attoparsec-iso8601-devel-1.1.0.0-3.1.aarch64.rpm"
RPM_HASH = "31ecab0a9645a71d768cec7ef9370d04dfe30a365c61569e9063171f4b68738babed2bc96ebf2a2da4b631451a4964a4966985ec6ebe9f34f1c5683e05948f97"

RPROVIDES:${PN} += "ghc-attoparsec-iso8601-devel \
ghc-devel-attoparsec-iso8601-1.1.0.0-7warWbAa4NQL4IDzyErxXZ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-attoparsec-iso8601 \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-batteries-0.13.0-KDp9q4HxJ7BLLDYSknS7AR \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82"

inherit rpm
