SUMMARY = "Rerun only tests which failed in a previous test run"
DESCRIPTION = "This ingredient for the <https://hackage.haskell.org/package/tasty tasty> \
testing framework allows filtering a test tree depending on the outcome of the \
previous run. This may be useful in many scenarios, especially when a test \
suite grows large."
LICENSE = "BSD-3-Clause"

PV = "1.1.18"

RPM_NAME = "ghc-tasty-rerun-1.1.18-6.2.aarch64.rpm"
RPM_HASH = "8ad28b5e8a55c5c1d6002697c9379802a0294d9b14baadf227d379e3875df5019539b5a31fc80c96938cfa69eed575851404c93073a15c0bfac021e09d139b6c"

RPROVIDES:${PN} += "ghc-tasty-rerun \
ghc-tasty-rerun(aarch-64) \
libHStasty-rerun-1.1.18-901DN5WLpsB5zohVN159Pf-ghc9.4.5.so()(64bit)"
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
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSoptparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHSprocess-1.6.16.0-ghc9.4.5.so()(64bit) \
libHSsplit-0.2.3.5-u3oGLAiW7JJbxIffWSCWf-ghc9.4.5.so()(64bit) \
libHSstm-2.5.1.0-ghc9.4.5.so()(64bit) \
libHStagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa-ghc9.4.5.so()(64bit) \
libHStasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libHSunix-2.7.3-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
