SUMMARY = "Haskell base16-bytestring library development files"
DESCRIPTION = "This package provides the Haskell base16-bytestring library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-devel-1.0.2.0-2.3.aarch64.rpm"
RPM_HASH = "f2f36ce620c7c1ab7677f82430126ccbce172535f6a57ba8e4adcd3cd667dd0f65753369e2bdef9aca7d60c6edd0aa07720976dacfdca2c8cc2457754d64428a"

RPROVIDES:${PN} += "ghc-base16-bytestring-devel \
ghc-devel-base16-bytestring-1.0.2.0-LI31ya5OMpR4awBMr256aJ"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-base16-bytestring \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1"

inherit rpm
