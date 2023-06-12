SUMMARY = "Haskell pem library development files"
DESCRIPTION = "This package provides the Haskell pem library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-devel-0.2.4-8.3.aarch64.rpm"
RPM_HASH = "7d76ac278e98cc4bbab8de6809895931e06d0364dfa29e1944da80472d0059509d5ba52a5f05e5f604479ff6f9719457e4059568930291ea60f273e9fc23191e"

RPROVIDES:${PN} += "ghc-devel(pem-0.2.4-GVwv4fsQYoEEDbQiUNwxns) \
ghc-pem-devel \
ghc-pem-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
ghc-pem"

inherit rpm
