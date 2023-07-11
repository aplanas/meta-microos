SUMMARY = "Directed acyclic graphs"
DESCRIPTION = "Directed acyclic graphs can be sorted topographically. Existence of topographic \
ordering allows writing many graph algorithms efficiently. And many graphs, \
e.g. most dependency graphs are acyclic! \
 \
There are some algorithms built-in: dfs, transpose, transitive closure, \
transitive reduction... Some algorithms even become not-so-hard to implement, \
like a longest path!."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-1.0.0.2-2.3.aarch64.rpm"
RPM_HASH = "5c07db35b3ecea9e36864092d8c4c433493da2ea0d40cc9476335b3ddc13b40b6605d9effb35f3c7e62298dc61254b1d41f9c38b0fe9a46681ff6344b6078c79"

RPROVIDES:${PN} += "ghc-topograph \
libHStopograph-1.0.0.2-I6mhBX3p9bHH2TZy30beYB-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbase-compat-0.13.0-Cvz3167VMpo6rdOohSlum3-ghc9.4.5.so \
libHSbase-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSprimitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libHSvector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp-ghc9.4.5.so \
libHSvector-stream-0.1.0.0-C5Yyq3DPEhXAQSqkM8V92s-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
