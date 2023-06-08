SUMMARY = "Haskell asn1-types profiling library"
DESCRIPTION = "This package provides the Haskell asn1-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-asn1-types-prof-0.3.4-5.3.aarch64.rpm"
RPM_HASH = "3fbc1d8d7b3862b1fcf00e15a023f149e02cecf6bdf18b4a11ba5d2f15fd766c77c5c0a87b303c7cea660afb491712cf3bddf94cfb1f1f53a855a363a5b2e809"

RPROVIDES:${PN} += "ghc-asn1-types-prof ghc-asn1-types-prof(aarch-64) ghc-prof(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm)"
RDEPENDS:${PN} += "ghc-asn1-types-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3) ghc-prof(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL)"

inherit rpm
