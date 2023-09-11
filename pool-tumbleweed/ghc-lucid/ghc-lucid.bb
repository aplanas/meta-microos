SUMMARY = "Clear to write, read and edit DSL for HTML"
DESCRIPTION = "Clear to write, read and edit DSL for HTML. \
 \
* Names are consistent, and do not conflict with base or are keywords (all have \
suffix '_') \
 \
* Same combinator can be used for attributes and elements (e.g. \
'style_') \
 \
* For more, read <https://chrisdone.com/posts/lucid the blog post> \
 \
See the 'Lucid' module for more documentation."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-2.11.20230408-1.6.aarch64.rpm"
RPM_HASH = "d610c8acb1c6743240f82952c2edaff1b0fd6252338267158008dc164215c17a9ef5fe9544e6b0cd86d7c6eb767b5a70e7cf4ddcf7899d683e8e3bd5c0c73848"

RPROVIDES:${PN} += "ghc-lucid \
libHSlucid-2.11.20230408-4cKgK8hqgER6myHRF5jLTD-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSblaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSmmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libHStransformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
