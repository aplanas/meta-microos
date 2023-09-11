SUMMARY = "Haskell brick profiling library"
DESCRIPTION = "This package provides the Haskell brick profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-prof-1.6-2.12.aarch64.rpm"
RPM_HASH = "d9b1c13e94f28dc6401b9585c01023f13fbd2ec93a4283196f89504a93ff9108492eeda3e31379706587de2c4497347db62ecdacabfdb54d7bfb4692cd599eda"

RPROVIDES:${PN} += "ghc-brick-prof \
ghc-prof-brick-1.6-F5erOer4ZSWDwKz5KL60D9"

RDEPENDS:${PN} += "ghc-brick-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bimap-0.5.0-2qQthh2dRFHF2jSbEkPfEn \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-config-ini-0.2.6.0-HoJpnqrH2zF9Zc2bv1CbDm \
ghc-prof-containers-0.6.7 \
ghc-prof-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-prof-data-clist-0.2-2XS2LK92Ow8274ZzRlQjKH \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-prof-microlens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h \
ghc-prof-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-prof-mtl-2.2.2 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-text-zipper-0.12-H7IYZaS5uJc9wNiAP20WIH \
ghc-prof-unix-2.7.3 \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-vty-5.38-LhnNmnv8DxxD0eeAip9uJs \
ghc-prof-word-wrap-0.5-6mKx5HwYguB2E3kl2rrPmY"

inherit rpm
