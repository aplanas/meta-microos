SUMMARY = "Haskell timerep profiling library"
DESCRIPTION = "This package provides the Haskell timerep profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-prof-2.1.0.0-1.11.aarch64.rpm"
RPM_HASH = "68b05d262839e635cfb2a3aef5cf5bd997838c243885fc78102cd9a6ec842c6812b7b3e218de2a34c5db229c5ea09a5d46b7b68258017660e1d10a5c89d6c11e"

RPROVIDES:${PN} += "ghc-prof-timerep-2.1.0.0-7Ytum8O35f0BaW4NCEYMdH \
ghc-timerep-prof"

RDEPENDS:${PN} += "ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-monoid-subclasses-1.2.3-5taTwF7VZKRLlaKR3bOBXt \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-timerep-devel"

inherit rpm
