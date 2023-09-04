SUMMARY = "A logging system for WAI"
DESCRIPTION = "A logging system for WAI."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ghc-wai-logger-2.4.0-2.9.aarch64.rpm"
RPM_HASH = "51c102d7bb1a024ec6a740e0fd98d3c1251cd527519603e304783c07e0f75986f7ec785206901773013b0cb02e25b6f4ac08c275da8ddad91f2f64d359ad6e50"

RPROVIDES:${PN} += "ghc-wai-logger \
libHSwai-logger-2.4.0-9HbB2lkmWIvBhHGAMxm4Zs-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSauto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbyteorder-1.0.4-HgduUBa2I8KG54Jejj0SY0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScase-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSdirectory-1.3.7.1-ghc9.4.6.so \
libHSeasy-file-0.2.5-IptebCGkAyyEfjLBFFjLI-ghc9.4.6.so \
libHSfast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHShttp-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p-ghc9.4.6.so \
libHSnetwork-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs-ghc9.4.6.so \
libHSold-locale-1.0.0.7-GoDuSK2NybfD0MMe75QkJk-ghc9.4.6.so \
libHSold-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libHSunix-compat-0.6-IJaiJvo5DQ6Elf7LVlEGei-ghc9.4.6.so \
libHSunix-time-0.4.10-fuTENic3zHIuWAM5F0fYB-ghc9.4.6.so \
libHSunordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn-ghc9.4.6.so \
libHSvault-0.3.1.5-JTstBlaocLP2eokwHW0Uig-ghc9.4.6.so \
libHSwai-3.2.3-JhFX1996sswH7nU4MZQSow-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
