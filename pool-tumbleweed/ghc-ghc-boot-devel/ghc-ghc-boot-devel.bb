SUMMARY = "Haskell ghc-boot library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-devel-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "34e7213c19c162c7698fcc8989665a57165dcdf2965787c4548e8ee2c00b4bfca15efc6ffbdab27727081e503a6181e838dd6ed79715be663e0581482a836454"

RPROVIDES:${PN} += "ghc-devel(ghc-boot-9.4.5) \
ghc-ghc-boot-devel \
ghc-ghc-boot-devel(aarch-64) \
ghc-ghc-boot-static \
ghc-ghc-boot-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(ghc-boot-th-9.4.5) \
ghc-devel(unix-2.7.3) \
ghc-ghc-boot(aarch-64)"

inherit rpm
