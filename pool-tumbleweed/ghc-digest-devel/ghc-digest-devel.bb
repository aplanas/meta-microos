SUMMARY = "Haskell digest library development files"
DESCRIPTION = "This package provides the Haskell digest library development files."
LICENSE = "BSD-2-Clause"

PV = "0.0.1.7"

RPM_NAME = "ghc-digest-devel-0.0.1.7-1.3.aarch64.rpm"
RPM_HASH = "4fa58139a71444eb11138098ef40726cdf485c814acc827d4b8ea6006926dccc24ab13da2ab7e4146670e03f9da5364758a03bcb2eba6cf643bcc1fb00191aaf"

RPROVIDES:${PN} += "ghc-devel-digest-0.0.1.7-CCCN8814sFy3HuiyT8t94G \
ghc-digest-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-digest \
pkgconfig \
pkgconfig-zlib"

inherit rpm
