SUMMARY = "Bindings for the iw C library"
DESCRIPTION = "A binding to the iw library for getting info about the current WiFi connection."
LICENSE = "BSD-3-Clause"

PV = "0.1.2"

RPM_NAME = "ghc-iwlib-0.1.2-2.2.aarch64.rpm"
RPM_HASH = "775ded85fa2395a5da38064d5c1e6af513561b616fd1e3e7c12d224dd8c5c9c5ed637b88adb085ea23849b4296947c989c172d1bc94ddc289eeb2ac37824f42f"

RPROVIDES:${PN} += "ghc-iwlib \
libHSiwlib-0.1.2-1s738Tb3Wf2CvjJviNtWBD-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libiw.so.30 \
libm.so.6"

inherit rpm
