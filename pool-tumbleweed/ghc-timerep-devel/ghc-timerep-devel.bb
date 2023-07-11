SUMMARY = "Haskell timerep library development files"
DESCRIPTION = "This package provides the Haskell timerep library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-devel-2.1.0.0-1.8.aarch64.rpm"
RPM_HASH = "16e9ba086eb325c24b69b362ad5e8996531e257d7fa1e46d9c36a485efb6e0d989abab3cb23563e9b273c8ac1f278c618663516decef3fe60ab9e32f427a3b3e"

RPROVIDES:${PN} += "ghc-devel-timerep-2.1.0.0-I3sgV342xF22sEKbdw3Ltk \
ghc-timerep-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-monoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-timerep"

inherit rpm
