SUMMARY = "Haskell config-ini library development files"
DESCRIPTION = "This package provides the Haskell config-ini library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.0"

RPM_NAME = "ghc-config-ini-devel-0.2.5.0-3.3.aarch64.rpm"
RPM_HASH = "a3e075cb6de964ec35c19a14d4b608d49cddc98054b3c8f2d179ca8f87cd8ef3ea4026ab05383a61f29ff1f4a33ad7026ec2523df0c83c1cd82754de8e1e937a"

RPROVIDES:${PN} += "ghc-config-ini-devel \
ghc-config-ini-devel(aarch-64) \
ghc-devel(config-ini-0.2.5.0-RR92dYVdpi9XWpA99EDX9)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-config-ini \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv) \
ghc-devel(text-2.0.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E)"

inherit rpm
