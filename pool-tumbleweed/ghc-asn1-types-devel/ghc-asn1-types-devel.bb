SUMMARY = "Haskell asn1-types library development files"
DESCRIPTION = "This package provides the Haskell asn1-types library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-devel-0.3.4-5.3.aarch64.rpm"
RPM_HASH = "e576fd0dea4f14a7bdced72e6bea197d037760e46a597dce9cfcc8953662cfb3e795c52583600e716e61470ba588de8974f6d1532748aebd80d7d0e0aa910634"

RPROVIDES:${PN} += "ghc-asn1-types-devel \
ghc-asn1-types-devel(aarch-64) \
ghc-devel(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm)"

RDEPENDS:${PN} += "/bin/sh \
ghc-asn1-types \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3) \
ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL)"

inherit rpm
