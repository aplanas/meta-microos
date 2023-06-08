SUMMARY = "Binding to the ALSA Library API (Exceptions)"
DESCRIPTION = "This package provides access to ALSA infrastructure, that is needed by both \
alsa-seq and alsa-pcm."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-0.5.0.1-4.2.aarch64.rpm"
RPM_HASH = "edd9fb49b217115e54f051ac5a617a0f095a2657baa79aae6eb7a16713e4d313266453c596d674b93d81638d54c33d04970f78dfd3203c50a3fb0659a2092e56"

RPROVIDES:${PN} += "ghc-alsa-core ghc-alsa-core(aarch-64) libHSalsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSextensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit)"

inherit rpm
