SUMMARY = "QuickCheck support for the Tasty test framework"
DESCRIPTION = "QuickCheck support for the Tasty test framework."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-0.10.2-2.2.aarch64.rpm"
RPM_HASH = "92709f0acf80d7392a8ec65b76dbf88ddc039e8db326273b71fe6eff3401406d2746a99bfe4b0d1f02a24d8f5469625eeb861e644d1661fab55e24dc1a9f9e3f"

RPROVIDES:${PN} += "ghc-tasty-quickcheck \
libHStasty-quickcheck-0.10.2-35bOuuNPLunDPSjWY1CT1e-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSQuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6-ghc9.4.5.so \
libHSansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3-ghc9.4.5.so \
libHSansi-terminal-types-0.11.5-9ffXWswmNhoANlpnF2SnhR-ghc9.4.5.so \
libHSansi-wl-pprint-0.6.9-1uNId4TIZRh7T7KEIBVXZI-ghc9.4.5.so \
libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScolour-2.3.6-7jQe2xj5Lsa5MbX38iH7Ln-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSdirectory-1.3.7.1-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSoptparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprocess-1.6.16.0-ghc9.4.5.so \
libHSrandom-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o-ghc9.4.5.so \
libHSsplitmix-0.1.0.4-7e8CibdlMRLAGh7KO5VlFe-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so \
libHStasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
