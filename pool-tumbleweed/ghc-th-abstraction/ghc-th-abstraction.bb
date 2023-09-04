SUMMARY = "Nicer interface for reified information about data types"
DESCRIPTION = "This package normalizes variations in the interface for inspecting datatype \
information via Template Haskell so that packages and support a single, easier \
to use informational datatype while supporting many versions of Template \
Haskell."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-0.4.5.0-2.8.aarch64.rpm"
RPM_HASH = "0c0254b49714ba1180e601090df3fd6fd7ec025c5dfa7f10e9726285e9bb39163da5a7b2da5d41e0b64e987fb46bd012a6352ac9a4dae7b84434d4b82669b948"

RPROVIDES:${PN} += "ghc-th-abstraction \
libHSth-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
