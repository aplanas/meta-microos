SUMMARY = "Haskell ghc-lib-parser profiling library"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.4.20221225"

RPM_NAME = "ghc-ghc-lib-parser-prof-9.4.4.20221225-1.3.aarch64.rpm"
RPM_HASH = "d85fb9859104b3d3190819fea5f13a0bca1c66aa7e421d8f08090f3eacdf96953a58e775bc09ef6cc9b1becc21744438be35a65c34e0caa9c326d252984bfc90"

RPROVIDES:${PN} += "ghc-ghc-lib-parser-prof \
ghc-ghc-lib-parser-prof(aarch-64) \
ghc-prof(ghc-lib-parser-9.4.4.20221225-IYLH4ajMYTmJphnJAgaapb)"
RDEPENDS:${PN} += "ghc-ghc-lib-parser-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(binary-0.8.9.1) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(parsec-3.1.16.1) \
ghc-prof(pretty-1.1.3.6) \
ghc-prof(process-1.6.16.0) \
ghc-prof(time-1.12.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unix-2.7.3)"

inherit rpm
