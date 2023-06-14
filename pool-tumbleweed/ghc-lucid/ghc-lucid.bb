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

RPM_NAME = "ghc-lucid-2.11.20230408-1.2.aarch64.rpm"
RPM_HASH = "275562dce91f7849d9ba52c9a5c9ea438e25222ac86cfab53d89fe74958eff6d98b233a0ebce0c643f0aa67a533cafae649665d4b0e7e3b2637610ca1efaf6c1"

RPROVIDES:${PN} += "ghc-lucid \
libHSlucid-2.11.20230408-4Nhfi0FKLIn9BurrsHVz0w-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSmmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC-ghc9.4.5.so \
libHSmtl-2.2.2-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libHStransformers-0.5.6.2-ghc9.4.5.so \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
