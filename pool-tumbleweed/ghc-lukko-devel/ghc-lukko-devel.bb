SUMMARY = "Haskell lukko library development files"
DESCRIPTION = "This package provides the Haskell lukko library development files."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-devel-0.1.1.3-5.6.aarch64.rpm"
RPM_HASH = "c5f6e7ad1f8e8179e567d51affe73e9d2719b25e24bbc87a9e760478d345ffda3c6d6db9beeccdc377cdd3419ee84bc8111e7e3a7e67e97d8d1620267c7af9c0"

RPROVIDES:${PN} += "ghc-devel-lukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V \
ghc-lukko-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-lukko"

inherit rpm
