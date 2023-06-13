SUMMARY = "Haskell tar library development files"
DESCRIPTION = "This package provides the Haskell tar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-devel-0.5.1.1-11.3.aarch64.rpm"
RPM_HASH = "905dc2d11880fc777b179950084cac147368b0c27bcfd8d9151d1a77fc835b22430011e44ac862ba2873c01ea361c3c14c9c59269d4389c2a15f51d2ad360de0"

RPROVIDES:${PN} += "ghc-devel(tar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8) \
ghc-tar-devel \
ghc-tar-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(time-1.12.2) \
ghc-tar"

inherit rpm
