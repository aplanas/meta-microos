SUMMARY = "Haskell silently library development files"
DESCRIPTION = "This package provides the Haskell silently library development files."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.3"

RPM_NAME = "ghc-silently-devel-1.2.5.3-2.2.aarch64.rpm"
RPM_HASH = "6fbd0ebed9e4a4c2dd6cebabfc2d13f32592c4062f2e68ae665f786daf9cd4010c86e5f4fc57cf209a543299e02efd5933dea28b13ed8443873456dababeb474"

RPROVIDES:${PN} += "ghc-devel-silently-1.2.5.3-HiTtkArMijI9DvRcUmgkYR \
ghc-silently-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-silently"

inherit rpm
