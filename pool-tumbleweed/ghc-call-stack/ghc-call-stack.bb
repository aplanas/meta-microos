SUMMARY = "Use GHC call-stacks in a backward compatible way"
DESCRIPTION = "Use GHC call-stacks in a backward compatible way."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ghc-call-stack-0.4.0-2.6.aarch64.rpm"
RPM_HASH = "1fdf0d174c0b91d607c5b0f05bd31771cf559fac425a54240f977d1f4cd76b691beda4005d518c26d0338adb527020ef35720e411fa6e114ad4a435dc983949f"

RPROVIDES:${PN} += "ghc-call-stack \
libHScall-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
