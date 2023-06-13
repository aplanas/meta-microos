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
ghc-lucid(aarch-64) \
libHSlucid-2.11.20230408-4Nhfi0FKLIn9BurrsHVz0w-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSblaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so()(64bit) \
libHSmmorph-1.2.0-4Mt4o3YW9h63uaZAnM2RZC-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libHStransformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd-ghc9.4.5.so()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
