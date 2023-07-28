SUMMARY = "Haskell clientsession profiling library"
DESCRIPTION = "This package provides the Haskell clientsession profiling library."
LICENSE = "MIT"

PV = "0.9.2.0"

RPM_NAME = "ghc-clientsession-prof-0.9.2.0-1.1.aarch64.rpm"
RPM_HASH = "3cd9625e5c1a9d0e8cc681c484d5cb3379e36a3266029b350265ea6cae90898108fc6cef1bdaccd876cf5effadbacea29220689a9b3cd873f1d1a62d3187571a"

RPROVIDES:${PN} += "ghc-clientsession-prof \
ghc-prof-clientsession-0.9.2.0-4cx1ifSXftyKQDB0RGxUDf"

RDEPENDS:${PN} += "ghc-clientsession-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-directory-1.3.7.1 \
ghc-prof-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-prof-setenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x \
ghc-prof-skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa"

inherit rpm
