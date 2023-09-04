SUMMARY = "Haskell lukko library development files"
DESCRIPTION = "This package provides the Haskell lukko library development files."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-devel-0.1.1.3-5.8.aarch64.rpm"
RPM_HASH = "caa6bc1fc643fefcb0fd1349ee92355920c5886c76893f414507d0c44e56a9e5d10f442cebbd819684f96d0c7a49185bdaf280e566fc32ea225287a316917f22"

RPROVIDES:${PN} += "ghc-devel-lukko-0.1.1.3-IWqFfSgydIZCIQyWjUior5 \
ghc-lukko-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-lukko"

inherit rpm
