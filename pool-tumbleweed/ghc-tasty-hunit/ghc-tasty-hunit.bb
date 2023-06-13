SUMMARY = "HUnit support for the Tasty test framework"
DESCRIPTION = "HUnit support for the Tasty test framework. \
 \
Note that this package does not depend on HUnit but implements the relevant \
subset of its API. The name is a legacy of the early versions of tasty-hunit \
and of test-framework-hunit, which did depend on HUnit."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-0.10.0.3-2.2.aarch64.rpm"
RPM_HASH = "74e2699f4f0c993c2e7fb6ba041f1af160758813abccb90ed7a3ee157489decdb0645cbca229edadf8c5852f3c4eaab19012aee4e78b04a41128c0b2d16f60a2"

RPROVIDES:${PN} += "ghc-tasty-hunit \
ghc-tasty-hunit(aarch-64) \
libHStasty-hunit-0.10.0.3-CV9N1Lkn3CAEveU82YsKyL-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so()(64bit) \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so()(64bit) \
libHSansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScall-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk-ghc9.4.5.so()(64bit) \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSdirectory-1.3.7.1-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSoptparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) \
libHStasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
