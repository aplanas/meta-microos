SUMMARY = "Haskell tls-session-manager profiling library"
DESCRIPTION = "This package provides the Haskell tls-session-manager profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.4"

RPM_NAME = "ghc-tls-session-manager-prof-0.0.4-4.6.aarch64.rpm"
RPM_HASH = "35800bf69d40a4206694ede74460aa47e0c3789b4debd7b47daec02ca89f3cd0b33d2e985a1d654da3a4f9356b8073adc1b2a344ed827f67dd7bd2aeb974962e"

RPROVIDES:${PN} += "ghc-prof-tls-session-manager-0.0.4-BZhuXicA1j0A1xtOmVohoA \
ghc-tls-session-manager-prof"

RDEPENDS:${PN} += "ghc-prof-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-prof-base-4.17.2.0 \
ghc-prof-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-clock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W \
ghc-prof-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-prof-psqueues-0.2.7.3-HjZq7FmM1u5AN66Kt7is6C \
ghc-prof-tls-1.6.0-D0DtS2mRMN13yCvXOGSBsv \
ghc-tls-session-manager-devel"

inherit rpm
