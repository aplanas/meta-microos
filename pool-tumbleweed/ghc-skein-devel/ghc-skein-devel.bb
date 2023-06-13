SUMMARY = "Haskell skein library development files"
DESCRIPTION = "This package provides the Haskell skein library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-devel-1.0.9.4-4.2.aarch64.rpm"
RPM_HASH = "d5f9e5086a1568ecba2e073922bd56d8563047f80aa87f64f0b2169a8c860ce622dc81913d5248332530cbdbe1383ca38d6358618db46bf83eeec636b2277cce"

RPROVIDES:${PN} += "ghc-devel(skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO) \
ghc-skein-devel \
ghc-skein-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) \
ghc-devel(crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-skein"

inherit rpm
