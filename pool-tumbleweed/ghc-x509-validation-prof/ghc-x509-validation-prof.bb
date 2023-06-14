SUMMARY = "Haskell x509-validation profiling library"
DESCRIPTION = "This package provides the Haskell x509-validation profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6.12"

RPM_NAME = "ghc-x509-validation-prof-1.6.12-2.3.aarch64.rpm"
RPM_HASH = "12960acc7cb15c667a8eb6457cd6eb59d1a8a64b7222949f925e9ca86b96ca2e8711720ebbac11de8e86c05a54fe80d9527eb54cee24aeba1c69c36c96d534e8"

RPROVIDES:${PN} += "ghc-prof-x509-validation-1.6.12-JQgBIAyKHQDDBxJK8FYPfO \
ghc-x509-validation-prof"

RDEPENDS:${PN} += "ghc-prof-asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk \
ghc-prof-asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3 \
ghc-prof-memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL \
ghc-prof-mtl-2.2.2 \
ghc-prof-pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns \
ghc-prof-x509-1.7.7-6vFRDfbnKcXIbE0ZlEHitw \
ghc-prof-x509-store-1.6.9-A3hCCAbvLt52rXl7zDFmSt \
ghc-x509-validation-devel"

inherit rpm
