SUMMARY = "Run IO operations asynchronously and wait for their results"
DESCRIPTION = "This package provides a higher-level interface over threads, in which an 'Async \
a' is a concurrent thread that will eventually deliver a value of type 'a'. \
The package provides ways to create 'Async' computations, wait for their \
results, and cancel them. \
 \
Using 'Async' is safer than using threads in two ways: \
 \
* When waiting for a thread to return a result, if the thread dies with an \
exception then the caller must either re-throw the exception ('wait') or handle \
it ('waitCatch'); the exception cannot be ignored. \
 \
* The API makes it possible to build a tree of threads that are automatically \
killed when their parent dies (see 'withAsync')."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "ghc-async-2.2.4-4.2.aarch64.rpm"
RPM_HASH = "95dde32a2245d87e1cce01b7f14847b055de6a4c4b77cc6ecdf45a2587c3c4c296a1d2c3f25f0fd0cdc56681378688ffb0629352d685ab299905b89abccfdd4b"

RPROVIDES:${PN} += "ghc-async \
libHSasync-2.2.4-Is3H7ZPNMkM5reIoCaqYrF-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSfilepath-1.4.2.2-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHShashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHSstm-2.5.1.0-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStext-2.0.2-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
