SUMMARY = "Default instances for types in containers"
DESCRIPTION = "Default instances for types in containers."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-containers-0.0.1-11.2.aarch64.rpm"
RPM_HASH = "c7fbc5dac6b4ef455fa4ab187947939d93fcc41850397e1e893e42f1a413f4db83c63b38ebc732497b82306fca7d0af575aab1521f749e7461e5e78b6e413fd0"

RPROVIDES:${PN} += "ghc-data-default-instances-containers \
libHSdata-default-instances-containers-0.0.1-GsTPO88BTeU5gVKxrRffFz-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdata-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
