SUMMARY = "Haskell pandoc-lua-engine profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-prof-0.2.0.1-1.3.aarch64.rpm"
RPM_HASH = "00929c8469dc4e5a4dc5cf0f96e5fd502b848ecf435068c7f441e9f2fd432a93c4ffb578ce1d8832f761d567bd2731d8f76de48782cf4595370f4921e5b626e3"

RPROVIDES:${PN} += "ghc-pandoc-lua-engine-prof \
ghc-prof-pandoc-lua-engine-0.2.0.1-La4O3ZU4C4fDUXOoCYvyuu"

RDEPENDS:${PN} += "ghc-pandoc-lua-engine-devel \
ghc-prof-SHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-citeproc-0.8.1-Ex3LMLw4y9Q5nAZv8bt8hk \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-prof-doctemplates-0.11-JIB0NPJebEE1gzCrfsk8Xp \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-2.3.0-AU21dADSMqd8jVkw5fw6gb \
ghc-prof-hslua-module-doclayout-1.1.0-whScExHkOx9DJU69TzJBc \
ghc-prof-hslua-module-path-1.1.0-H35lL8Cos84Ew14x3WsMMD \
ghc-prof-hslua-module-system-1.1.0.1-7243M7wFNHXL9pjhXYmDQK \
ghc-prof-hslua-module-text-1.1.0.1-EvPw7u7E7fn9ZAp58nb6qh \
ghc-prof-hslua-module-version-1.1.0-LnOsxVbcWQY3m2SquoHReg \
ghc-prof-hslua-module-zip-1.1.0-HbdBiDu9SYHDsbypcn78hx \
ghc-prof-hslua-repl-0.1.1-Cn1WzYftAVL4Hlxy0N0ea1 \
ghc-prof-lpeg-1.0.4-IadFjeA522fGKCuUXCvVP9 \
ghc-prof-mtl-2.2.2 \
ghc-prof-pandoc-3.1.3-5ecWWg0ojZ38IHcxSTWJz4 \
ghc-prof-pandoc-lua-marshal-0.2.2-sn2ZVEcWlgDOuaBIv7GGF \
ghc-prof-pandoc-types-1.23-4C1nzwOnt973xRAA9sp531 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2"

inherit rpm
