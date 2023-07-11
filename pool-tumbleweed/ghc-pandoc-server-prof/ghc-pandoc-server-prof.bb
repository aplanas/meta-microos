SUMMARY = "Haskell pandoc-server profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-server profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.0.1"

RPM_NAME = "ghc-pandoc-server-prof-0.1.0.1-1.1.aarch64.rpm"
RPM_HASH = "882fd323abf70b34585ac36961c330e7a1e1b0a9a08e4fa0cb8d305204b9e732b74773a459f0377d1f5dff708fb3e92cfcc49fe735147c0c85f8095af9f58514"

RPROVIDES:${PN} += "ghc-pandoc-server-prof \
ghc-prof-pandoc-server-0.1.0.1-HnYIKv9BCdu3meEtnOuJh2"

RDEPENDS:${PN} += "ghc-pandoc-server-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-base64-0.4.2.4-A6ZHULO0U6jEqaRLwqb1vV \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp \
ghc-prof-pandoc-3.1.3-5ecWWg0ojZ38IHcxSTWJz4 \
ghc-prof-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-prof-servant-server-0.19.2-4FIb8LV7jij3EgayMId9y \
ghc-prof-skylighting-0.13.3-KhN5DzrcPQALN95CsO2kAp \
ghc-prof-text-2.0.2 \
ghc-prof-unicode-collation-0.1.3.4-LMKRbY0RRBBKxwMiir45sP \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-wai-cors-0.2.7-837xDMoVzk8L5Mw3yyuBT9"

inherit rpm
