SUMMARY = "Haskell clientsession library development files"
DESCRIPTION = "This package provides the Haskell clientsession library development files."
LICENSE = "MIT"

PV = "0.9.2.0"

RPM_NAME = "ghc-clientsession-devel-0.9.2.0-2.1.aarch64.rpm"
RPM_HASH = "fcf86e6629f82300eb70d6d707a5f83ca88492e0015d6ba94b3718722586c725c346317a1e7962a8a03d1c11f1209689eacc8505711a7dead95991d2bbdf3e41"

RPROVIDES:${PN} += "ghc-clientsession-devel \
ghc-devel-clientsession-0.9.2.0-4cx1ifSXftyKQDB0RGxUDf"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-clientsession \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-directory-1.3.7.1 \
ghc-devel-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-devel-setenv-0.1.1.3-5NpDWBw9aN36gdxnY8UI9x \
ghc-devel-skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa"

inherit rpm
