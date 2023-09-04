SUMMARY = "Haskell config-ini library development files"
DESCRIPTION = "This package provides the Haskell config-ini library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.0"

RPM_NAME = "ghc-config-ini-devel-0.2.6.0-1.5.aarch64.rpm"
RPM_HASH = "957de2baf5ee669dbae16e3be5f74abf6ecf6c20261875f38d82353b74eed85e24fe362fcbd6644550b180884e0a96098dac5425a8f342cc57f589e1393d0b9b"

RPROVIDES:${PN} += "ghc-config-ini-devel \
ghc-devel-config-ini-0.2.6.0-HoJpnqrH2zF9Zc2bv1CbDm"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-config-ini \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn"

inherit rpm
