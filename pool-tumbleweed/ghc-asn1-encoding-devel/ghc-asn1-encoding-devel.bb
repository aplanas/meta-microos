SUMMARY = "Haskell asn1-encoding library development files"
DESCRIPTION = "This package provides the Haskell asn1-encoding library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-devel-0.9.6-8.8.aarch64.rpm"
RPM_HASH = "6f5ae1372f6b5f6a9ca62c84e59135845688194ff9c1ce4027a0f57186a3e6485962d2e36f907b9895314f6de5e93718141762c2bd9843b198d9c666245b5110"

RPROVIDES:${PN} += "ghc-asn1-encoding-devel \
ghc-devel-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asn1-encoding \
ghc-compiler \
ghc-devel-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho"

inherit rpm
