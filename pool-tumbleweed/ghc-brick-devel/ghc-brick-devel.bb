SUMMARY = "Haskell brick library development files"
DESCRIPTION = "This package provides the Haskell brick library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "ghc-brick-devel-1.6-2.12.aarch64.rpm"
RPM_HASH = "d774f59a42fb15c2117f00fdce7c1b19b4078f7376d231e3145ec40f00274c91cb99692b3fdda48fdfda329eb6869b92a7248b4db9f4a5d96b55627bbf15de88"

RPROVIDES:${PN} += "ghc-brick-devel \
ghc-devel-brick-1.6-F5erOer4ZSWDwKz5KL60D9"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-brick \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bimap-0.5.0-2qQthh2dRFHF2jSbEkPfEn \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-config-ini-0.2.6.0-HoJpnqrH2zF9Zc2bv1CbDm \
ghc-devel-containers-0.6.7 \
ghc-devel-contravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT \
ghc-devel-data-clist-0.2-2XS2LK92Ow8274ZzRlQjKH \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-devel-microlens-mtl-0.2.0.3-Lyey6r2oahMEeZXe0uSI9h \
ghc-devel-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-devel-mtl-2.2.2 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-text-zipper-0.12-H7IYZaS5uJc9wNiAP20WIH \
ghc-devel-unix-2.7.3 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-vty-5.38-LhnNmnv8DxxD0eeAip9uJs \
ghc-devel-word-wrap-0.5-6mKx5HwYguB2E3kl2rrPmY"

inherit rpm
