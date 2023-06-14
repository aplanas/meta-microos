SUMMARY = "Haskell pem profiling library"
DESCRIPTION = "This package provides the Haskell pem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-prof-0.2.4-8.3.aarch64.rpm"
RPM_HASH = "85c0774dc6d91736572081c9a8475739468b7e3386dd70c6e349b6d46198b4157297447eb5ee5081fe2adf8f80d3e6526231778b91424273684f8e33d6f7725a"

RPROVIDES:${PN} += "ghc-pem-prof \
ghc-prof-pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns"

RDEPENDS:${PN} += "ghc-pem-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL"

inherit rpm
