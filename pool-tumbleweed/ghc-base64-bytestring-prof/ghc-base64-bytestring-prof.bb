SUMMARY = "Haskell base64-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell base64-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-prof-1.2.1.0-3.1.aarch64.rpm"
RPM_HASH = "52a490a3377aaf951ac3b3bd7d44d2834a0902e16a1919c97749cd77d43d045ffdc53f4038acc023523d42fb1e5308c001eae378719d3906f183d8796c0db676"

RPROVIDES:${PN} += "ghc-base64-bytestring-prof \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh"

RDEPENDS:${PN} += "ghc-base64-bytestring-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0"

inherit rpm
