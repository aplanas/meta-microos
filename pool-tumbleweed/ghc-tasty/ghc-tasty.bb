SUMMARY = "Modern and extensible testing framework"
DESCRIPTION = "Tasty is a modern testing framework for Haskell. It lets you combine your unit \
tests, golden tests, QuickCheck/SmallCheck properties, and any other types of \
tests into a single test suite."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "ghc-tasty-1.4.3-1.3.aarch64.rpm"
RPM_HASH = "b11d0abc1b5799e40ec6dd9e451395ba3489a06f55ad7427481187e5e109a394b77ac64e161e64b4a99586500db2e87bb8e668711893e9879962a801efb2dcdb"

RPROVIDES:${PN} += "ghc-tasty \
ghc-tasty(aarch-64) \
libHStasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so()(64bit) \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so()(64bit) \
libHSansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI-ghc9.4.5.so()(64bit) \
libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
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
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
