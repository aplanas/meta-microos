SUMMARY = "Binding to the ALSA Library API (Exceptions)"
DESCRIPTION = "This package provides access to ALSA infrastructure, that is needed by both \
alsa-seq and alsa-pcm."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-0.5.0.1-4.4.aarch64.rpm"
RPM_HASH = "382b37a2a058328b845b410357bee7433b41305b4e4a56366cf4e634bdd5042f3a876bc9088feb1d0f08dc804bc29093bf77605ca5c8f59a32e2edfc98816844"

RPROVIDES:${PN} += "ghc-alsa-core \
libHSalsa-core-0.5.0.1-5CJfdeELTf160s2ftizQdy-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSextensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libasound.so.2 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
