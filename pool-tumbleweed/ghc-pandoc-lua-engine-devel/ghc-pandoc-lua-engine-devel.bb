SUMMARY = "Haskell pandoc-lua-engine library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-engine library development \
files."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.0.1"

RPM_NAME = "ghc-pandoc-lua-engine-devel-0.2.0.1-1.6.aarch64.rpm"
RPM_HASH = "9658ea8b819b100c0dbf4d36624e8ec6b7d46218b2c9d8654ede413c02e50aef2bba0cd1c3e1576d84fd0102e6a6eb457b1f5d219608c758e76ef0476c18f6f4"

RPROVIDES:${PN} += "ghc-devel-pandoc-lua-engine-0.2.0.1-5sUPoxcrHZ3FzfN1da4tRi \
ghc-pandoc-lua-engine-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-SHA-1.6.4.4-CTRZ9m1gmyY35Z2xnCckJW \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-citeproc-0.8.1-IdWRS5bkx4mHz8SxZquXUQ \
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
ghc-devel-pandoc-3.1.3-ImQr97Zc2bP55LDbAec3vO \
ghc-devel-pandoc-lua-marshal-0.2.2-FczgTsDU3sCHicuhmGSmSB \
ghc-devel-pandoc-types-1.23.0.1-EcvZluXpPb0J10kJC4UfRg \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-pandoc-lua-engine"

inherit rpm
