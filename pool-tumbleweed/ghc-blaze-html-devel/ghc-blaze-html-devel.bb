SUMMARY = "Haskell blaze-html library development files"
DESCRIPTION = "This package provides the Haskell blaze-html library development files."
LICENSE = "BSD-3-Clause"

PV = "0.9.1.2"

RPM_NAME = "ghc-blaze-html-devel-0.9.1.2-10.1.aarch64.rpm"
RPM_HASH = "2086d212ef379537beb82f6acd61c9d9ddd35107ddc696dbe28953eb2efeec4e22e93963084cbd176ab5ba978762ef71df9a755328cc7ef52fc87657565ac55b"

RPROVIDES:${PN} += "ghc-blaze-html-devel \
ghc-devel-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-html \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-devel-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-text-2.0.2"

inherit rpm
