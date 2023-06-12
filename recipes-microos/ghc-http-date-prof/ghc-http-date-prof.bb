SUMMARY = "Haskell http-date profiling library"
DESCRIPTION = "This package provides the Haskell http-date profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-prof-0.0.11-2.3.aarch64.rpm"
RPM_HASH = "ca27867daf673cefb7b884feae6c3c2cc97af56f7e939cc3cf167afb647ff11275b752d2cde6259a44f575c472d8c607a1f7adfc42d9e77f33d8ba5528db1708"

RPROVIDES:${PN} += "ghc-http-date-prof \
ghc-http-date-prof(aarch-64) \
ghc-prof(http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD)"
RDEPENDS:${PN} += "ghc-http-date-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(time-1.12.2)"

inherit rpm
