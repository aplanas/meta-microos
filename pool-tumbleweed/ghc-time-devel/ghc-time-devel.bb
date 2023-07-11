SUMMARY = "Haskell time library development files"
DESCRIPTION = "This package provides the Haskell time library development files."
LICENSE = "BSD-3-Clause"

PV = "1.12.2"

RPM_NAME = "ghc-time-devel-1.12.2-3.2.aarch64.rpm"
RPM_HASH = "18b906793eb7a0696d2667c54407d1c4d73b132413e389c16294520093e71084e29959a4e5468f581a02333d330b157a1c0f3b8f1089946c54f11e40d6da721b"

RPROVIDES:${PN} += "ghc-devel-time-1.12.2 \
ghc-time-devel \
ghc-time-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-time"

inherit rpm
