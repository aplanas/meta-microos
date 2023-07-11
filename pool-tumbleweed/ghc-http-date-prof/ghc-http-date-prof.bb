SUMMARY = "Haskell http-date profiling library"
DESCRIPTION = "This package provides the Haskell http-date profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-prof-0.0.11-2.6.aarch64.rpm"
RPM_HASH = "9a5a839021e1858ca9e0b2b67dd693fefaa111738393eced6f20580ea5ae9aa297ec3f9b9501e5adfccbeaec1cb62d35f6484abd1066dfec276be3f5c66c93d0"

RPROVIDES:${PN} += "ghc-http-date-prof \
ghc-prof-http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD"

RDEPENDS:${PN} += "ghc-http-date-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-time-1.12.2"

inherit rpm
