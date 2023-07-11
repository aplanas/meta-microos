SUMMARY = "Haskell pandoc-server library development files"
DESCRIPTION = "This package provides the Haskell pandoc-server library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.1"

RPM_NAME = "ghc-pandoc-server-devel-0.1.0.1-1.1.aarch64.rpm"
RPM_HASH = "dd4eca989474665a3f6e0d38c1db13448733ee3b3986a56514faf646592bffd67b9450d799a4f1f69715adca8de7358512929afb7780e3bfeb27517f192beff1"

RPROVIDES:${PN} += "ghc-devel-pandoc-server-0.1.0.1-HnYIKv9BCdu3meEtnOuJh2 \
ghc-pandoc-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp \
ghc-devel-pandoc-3.1.3-5ecWWg0ojZ38IHcxSTWJz4 \
ghc-devel-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-devel-servant-server-0.19.2-4FIb8LV7jij3EgayMId9y \
ghc-devel-skylighting-0.13.3-KhN5DzrcPQALN95CsO2kAp \
ghc-devel-text-2.0.2 \
ghc-devel-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-cors-0.2.7-837xDMoVzk8L5Mw3yyuBT9 \
ghc-pandoc-server"

inherit rpm
