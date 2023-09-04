SUMMARY = "Haskell SHA library development files"
DESCRIPTION = "This package provides the Haskell SHA library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-devel-1.6.4.4-8.3.aarch64.rpm"
RPM_HASH = "41b5513ba6781b46f88aa2256fb66a6bbeba025c65eee0e0c4c195cffbb7d9a745b53ff8d01cca356c815c3f9c3c7be3822af1e6df53fc2b79433c9930cd1407"

RPROVIDES:${PN} += "ghc-SHA-devel \
ghc-devel-SHA-1.6.4.4-ECOkYIcPN6aC9icBjFCZ1l"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-SHA \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm
