SUMMARY = "Haskell timerep profiling library"
DESCRIPTION = "This package provides the Haskell timerep profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-prof-2.1.0.0-1.5.aarch64.rpm"
RPM_HASH = "6ceb9381600de2eaa0ac0596da66bf3b9a611fa6dac963b2b79e99f8f45807aa176dbe3e03d4d8c8f95664fa306f7ea1407c7ff394fdef4e1786afd400201428"

RPROVIDES:${PN} += "ghc-prof(timerep-2.1.0.0-I3sgV342xF22sEKbdw3Ltk) \
ghc-timerep-prof \
ghc-timerep-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(monoid-subclasses-1.2.3-3ZmDzuybbdXkWlfa352KR) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2) \
ghc-timerep-devel"

inherit rpm
