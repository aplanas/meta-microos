SUMMARY = "Haskell utf8-string library development files"
DESCRIPTION = "This package provides the Haskell utf8-string library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-devel-1.0.2-2.6.aarch64.rpm"
RPM_HASH = "885f2537d770aab8d75ae9c69902b87bc85d6d96960002cefeafcb482c3bf53e273b3dc0ed80465b53270a85cdfa8b2bf8416ccef5543bfeed0f12d2c95ae5c6"

RPROVIDES:${PN} += "ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-utf8-string-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-utf8-string"

inherit rpm
