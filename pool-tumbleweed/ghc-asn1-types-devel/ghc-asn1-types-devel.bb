SUMMARY = "Haskell asn1-types library development files"
DESCRIPTION = "This package provides the Haskell asn1-types library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-devel-0.3.4-5.8.aarch64.rpm"
RPM_HASH = "7e8b20480a8c96c201950231372d1bd27125be06ba8587b2dc2c1b9afd3aaf2927db4e33c48f9f7eed9f9277a48264786033a747ca6fe223d2c029940c606144"

RPROVIDES:${PN} += "ghc-asn1-types-devel \
ghc-devel-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-asn1-types \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho \
ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1"

inherit rpm
