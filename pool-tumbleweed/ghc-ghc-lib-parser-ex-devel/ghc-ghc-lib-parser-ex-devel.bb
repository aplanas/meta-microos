SUMMARY = "Haskell ghc-lib-parser-ex library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser-ex library development \
files."
LICENSE = "BSD-3-Clause"

PV = "9.4.0.0"

RPM_NAME = "ghc-ghc-lib-parser-ex-devel-9.4.0.0-1.3.aarch64.rpm"
RPM_HASH = "59a249878fe4d64ee60e8fc205fab005174f5a063df66b0a808e031a259015569cc3fa748f660da21c14769d8f35a777b8b09a63a5b437f4a63649a5d639a290"

RPROVIDES:${PN} += "ghc-devel(ghc-lib-parser-ex-9.4.0.0-70SEjDlvh6sIQjB4r4CbU7) \
ghc-ghc-lib-parser-ex-devel \
ghc-ghc-lib-parser-ex-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(ghc-lib-parser-9.4.4.20221225-IYLH4ajMYTmJphnJAgaapb) \
ghc-devel(uniplate-1.6.13-3GboCmnxCZ4BmbYwVaL4sN) \
ghc-ghc-lib-parser-ex"

inherit rpm
