SUMMARY = "Haskell persistent-sqlite library development files"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library development \
files."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-devel-2.13.1.1-2.4.aarch64.rpm"
RPM_HASH = "a12fa0149c1866aeae47b74c9c1e0127233ba889ec5b432c033af06ff53977edd194af09fc3036543a8ba16595d515b05fc3ea0984af24b37b12caaddc3f124e"

RPROVIDES:${PN} += "ghc-devel(persistent-sqlite-2.13.1.1-6m8kOitQFXeAVXzn0JSxB5) \
ghc-persistent-sqlite-devel \
ghc-persistent-sqlite-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(containers-0.6.7) \
ghc-devel(microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG) \
ghc-devel(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA) \
ghc-devel(mtl-2.2.2) \
ghc-devel(persistent-2.14.5.0-52EbT4CA3Ct4CmrnsbaA80) \
ghc-devel(resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW) \
ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-persistent-sqlite \
glibc-devel \
sqlite3-devel"

inherit rpm
