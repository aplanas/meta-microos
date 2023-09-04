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

RPM_NAME = "ghc-async-2.2.4-4.4.aarch64.rpm"
RPM_HASH = "665932ac466492c5ed8070a36f96633a22e79d075a66cc63908209df7ec15c434329c53a0843b2dd6cdb3e5d859e3148aec4178790a3b74cad887fbdcc17acaf"

RPROVIDES:${PN} += "ghc-async \
libHSasync-2.2.4-LcXCzTmy8C6G7Wa774EctI-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHSstm-2.5.1.0-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
