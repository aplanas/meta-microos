SUMMARY = "Haskell pem profiling library"
DESCRIPTION = "This package provides the Haskell pem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-prof-0.2.4-8.8.aarch64.rpm"
RPM_HASH = "36415e218eaf23304646fc354d9e82810d0e152c1d35fb5f37a268256ce594ad6d0c5157114c94e0558eb015e02c40fba2874f8c2c34763e8d8c0b79c5cfc5aa"

RPROVIDES:${PN} += "ghc-pem-prof \
ghc-prof-pem-0.2.4-F5Ih0vrB4sf5XALvrxfus2"

RDEPENDS:${PN} += "ghc-pem-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1"

inherit rpm
