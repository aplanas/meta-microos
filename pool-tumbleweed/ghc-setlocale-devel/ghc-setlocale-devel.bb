SUMMARY = "Haskell setlocale library development files"
DESCRIPTION = "This package provides the Haskell setlocale library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.10"

RPM_NAME = "ghc-setlocale-devel-1.0.0.10-4.3.aarch64.rpm"
RPM_HASH = "232de87eaa3f4dd9083be5280d01bd98965da0cfa6f757a9c349abf4e7f15a6ff66de002b8d9766dccc41aeab62551274b902e9cfa6d05d439efc5dd619f013e"

RPROVIDES:${PN} += "ghc-devel-setlocale-1.0.0.10-EX0ACS22UctCUxDRUitp1V \
ghc-setlocale-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-setlocale"

inherit rpm
