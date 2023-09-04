SUMMARY = "Haskell auto-update profiling library"
DESCRIPTION = "This package provides the Haskell auto-update profiling library."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-prof-0.1.6-6.8.aarch64.rpm"
RPM_HASH = "12abce69e961cfb828195716633fb647ac3dac622591d444c2924a73954745bc25555c4c663556adf8d0067d5706d86d2771af43c9d82bfde2b5a618ad2f0de1"

RPROVIDES:${PN} += "ghc-auto-update-prof \
ghc-prof-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc"

RDEPENDS:${PN} += "ghc-auto-update-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
