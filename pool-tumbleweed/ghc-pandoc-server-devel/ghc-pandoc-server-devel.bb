SUMMARY = "Haskell pandoc-server library development files"
DESCRIPTION = "This package provides the Haskell pandoc-server library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.1"

RPM_NAME = "ghc-pandoc-server-devel-0.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "f4aac31c10228ad6fee2e43a36bb046f240fddf23ae8d1b8f9dbcca19acc5313e93cea38615f6d171826fe7435759e02b9652528abce3b68f32af8770e763f1c"

RPROVIDES:${PN} += "ghc-devel-pandoc-server-0.1.0.1-L6ysttCIGd8BVt8PMwIGHm \
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
ghc-devel-pandoc-3.1.3-IvLrz4YIivMLuf8ZxaBxIb \
ghc-devel-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-devel-servant-server-0.19.2-45Ad5DaXbfZ3KJksjW89lv \
ghc-devel-skylighting-0.13.3-KhN5DzrcPQALN95CsO2kAp \
ghc-devel-text-2.0.2 \
ghc-devel-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-cors-0.2.7-837xDMoVzk8L5Mw3yyuBT9 \
ghc-pandoc-server"

inherit rpm
