SUMMARY = "Haskell pandoc-lua-engine library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-devel-0.2.0.1-1.3.aarch64.rpm"
RPM_HASH = "fdf916382b79393ec0c06736d41c59894c61cc69703b9be6c89e3d0cff7130e4fe07527f2f1e128fbea51cd42f319fecf9ce6b57551c8d642fdda84207b5a020"

RPROVIDES:${PN} += "ghc-devel-pandoc-lua-engine-0.2.0.1-La4O3ZU4C4fDUXOoCYvyuu \
ghc-pandoc-lua-engine-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-SHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-citeproc-0.8.1-Ex3LMLw4y9Q5nAZv8bt8hk \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-devel-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-2.3.0-AU21dADSMqd8jVkw5fw6gb \
ghc-devel-hslua-module-doclayout-1.1.0-whScExHkOx9DJU69TzJBc \
ghc-devel-hslua-module-path-1.1.0-H35lL8Cos84Ew14x3WsMMD \
ghc-devel-hslua-module-system-1.1.0.1-7243M7wFNHXL9pjhXYmDQK \
ghc-devel-hslua-module-text-1.1.0.1-EvPw7u7E7fn9ZAp58nb6qh \
ghc-devel-hslua-module-version-1.1.0-LnOsxVbcWQY3m2SquoHReg \
ghc-devel-hslua-module-zip-1.1.0-HbdBiDu9SYHDsbypcn78hx \
ghc-devel-hslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1 \
ghc-devel-lpeg-1.0.4-IadFjeA522fGKCuUXCvVP9 \
ghc-devel-mtl-2.2.2 \
ghc-devel-pandoc-3.1.3-5ecWWg0ojZ38IHcxSTWJz4 \
ghc-devel-pandoc-lua-marshal-0.2.2-sn2ZVEcWlgDOuaBIv7GGF \
ghc-devel-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-pandoc-lua-engine"

inherit rpm
