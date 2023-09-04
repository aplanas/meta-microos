SUMMARY = "Haskell uuid-types library development files"
DESCRIPTION = "This package provides the Haskell uuid-types library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "ghc-uuid-types-devel-1.0.5-5.4.aarch64.rpm"
RPM_HASH = "71539738ef4bbfae3e6b01404928f6ba7389e1cc1d50e5305858b5877086d0dbe8a536f18a99e818b81cd1a6ad4d3b4357e690e49a57e7d62d7e1478558eee13"

RPROVIDES:${PN} += "ghc-devel-uuid-types-1.0.5-34Qd5N8tYIyGW5LtrFWnkV \
ghc-uuid-types-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-uuid-types"

inherit rpm
