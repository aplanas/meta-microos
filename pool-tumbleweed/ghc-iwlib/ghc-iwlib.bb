SUMMARY = "Bindings for the iw C library"
DESCRIPTION = "A binding to the iw library for getting info about the current WiFi connection."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-0.1.2-2.3.aarch64.rpm"
RPM_HASH = "dd8356944889491aa47059ed48e7d3d192ecaceeafac072c39e9cef145175c0c22e5bda201661b6f40f7eb597ec27ce0689ad00e7baf307c4cadd05dab841be5"

RPROVIDES:${PN} += "ghc-iwlib \
libHSiwlib-0.1.2-DBPHxQHnFovIGpbAOJfyp4-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libiw.so.30 \
libm.so.6"

inherit rpm
