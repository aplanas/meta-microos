SUMMARY = "Haskell microstache library development files"
DESCRIPTION = "This package provides the Haskell microstache library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.3"

RPM_NAME = "ghc-microstache-devel-1.0.2.3-3.2.aarch64.rpm"
RPM_HASH = "a9f6b4e5e475b0652bda5e51d2ef0ceb96266fd567b59ca9eafbd2d2452db262e936b48b4557f3688cb73157c7e7f722b686b93f554f586f258eddd3e3ebfa3c"

RPROVIDES:${PN} += "ghc-devel-microstache-1.0.2.3-HPIMoirZDKg7hPtdxDNWtL \
ghc-microstache-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-microstache"

inherit rpm
