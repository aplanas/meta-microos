SUMMARY = "Contravariant functors"
DESCRIPTION = "Contravariant functors."
LICENSE = "BSD-3-Clause"

PV = "1.5.5"

RPM_NAME = "ghc-contravariant-1.5.5-2.8.aarch64.rpm"
RPM_HASH = "16934b4e13a0e8073f4ea8c1127b83d9ce73fe77bd41f0ddc3942c36bc1e98a52ea8af45deb437a5f4e7e50684b9395399f421fe1a71950b4dd70c328d8c28b3"

RPROVIDES:${PN} += "ghc-contravariant \
libHScontravariant-1.5.5-35YFLB0uIuz5cknUjKLNnT-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSStateVar-1.2.2-8Hv9klK7mv0HId52XsoM7J-ghc9.4.6.so \
libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
