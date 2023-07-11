SUMMARY = "Binding to the ALSA Library API (Exceptions)"
DESCRIPTION = "This package provides access to ALSA infrastructure, that is needed by both \
alsa-seq and alsa-pcm."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-0.5.0.1-4.3.aarch64.rpm"
RPM_HASH = "2c0dc1d051e129e4a317d7fccf1e7cfc72db96941fd77c82147171ebfbf11368c7762294592c248e669f8ace5b4f9ea4575c4c9aeab08360ea345e9de9afd6bf"

RPROVIDES:${PN} += "ghc-alsa-core \
libHSalsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSextensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libasound.so.2 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
