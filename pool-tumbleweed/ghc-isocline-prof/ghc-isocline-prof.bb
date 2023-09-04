SUMMARY = "Haskell isocline profiling library"
DESCRIPTION = "This package provides the Haskell isocline profiling library."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-prof-1.0.9-1.8.aarch64.rpm"
RPM_HASH = "180c2abf1c2a21a7a07246fe688a3e758f4486b024e3aaa5fc041b6dee1de410331aacd04b469b05a2d9e33cc4a415b02a147b13098c21326d3b45b6d676bfab"

RPROVIDES:${PN} += "ghc-isocline-prof \
ghc-prof-isocline-1.0.9-5gDpTZgmtmsDJNf9j9fI7b"

RDEPENDS:${PN} += "ghc-isocline-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2"

inherit rpm
