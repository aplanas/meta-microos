SUMMARY = "HUnit support for the Tasty test framework"
DESCRIPTION = "HUnit support for the Tasty test framework. \
 \
Note that this package does not depend on HUnit but implements the relevant \
subset of its API. The name is a legacy of the early versions of tasty-hunit \
and of test-framework-hunit, which did depend on HUnit."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-0.10.0.3-2.3.aarch64.rpm"
RPM_HASH = "363d1117e69421d0f735638979e7e4239f08054350096f6eafc48f528a8b3c3263034287e35f3d74614585784df5305874fcf5f744a35bb20d9c3fdb8e2c2590"

RPROVIDES:${PN} += "ghc-tasty-hunit \
libHStasty-hunit-0.10.0.3-6X5qFyvC3YwCq8i9tfXsji-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScall-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSoptparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2-ghc9.4.5.so \
libHSprettyprinter-ansi-terminal-1.1.3-QQli2Jew8AdEXEsQuhGa-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStasty-1.4.3-18zApXOtbThAhmaMCCQRWB-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
