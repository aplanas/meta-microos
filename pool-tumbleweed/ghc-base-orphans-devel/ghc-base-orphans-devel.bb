SUMMARY = "Haskell base-orphans library development files"
DESCRIPTION = "This package provides the Haskell base-orphans library development files."
LICENSE = "MIT"

PV = "0.8.8.2"

RPM_NAME = "ghc-base-orphans-devel-0.8.8.2-1.2.aarch64.rpm"
RPM_HASH = "5c381598ae8334e7c69ade92c6dacea249769c4bebdc00a6033055c8ed35fa5f5018e30435fadeef3a93708bd61d62297d2dd71183670f115a6f9b04da954210"

RPROVIDES:${PN} += "ghc-base-orphans-devel \
ghc-base-orphans-devel(aarch-64) \
ghc-devel(base-orphans-0.8.8.2-Hl8yFKsRlc4HPNXP65SlX8)"

RDEPENDS:${PN} += "/bin/sh \
ghc-base-orphans \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(ghc-prim-0.9.0)"

inherit rpm
