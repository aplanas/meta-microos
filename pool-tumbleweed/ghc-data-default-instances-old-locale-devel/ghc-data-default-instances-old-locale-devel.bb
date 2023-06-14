SUMMARY = "Haskell data-default-instances-old-locale library development files"
DESCRIPTION = "This package provides the Haskell data-default-instances-old-locale library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-old-locale-devel-0.0.1-11.2.aarch64.rpm"
RPM_HASH = "a7fdaef7eec1cdb80fd45cc8f48d988eca9c3d3a570f49c2dd0e0a68f2ef0b4e9c09efa958e048d8d5143a9863257fd13eb5354b5d16843e5c818b6cf31ae582"

RPROVIDES:${PN} += "ghc-data-default-instances-old-locale-devel \
ghc-devel-data-default-instances-old-locale-0.0.1-7AZu0A9Np87C6EgyuU2uGo"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-data-default-instances-old-locale \
ghc-devel-base-4.17.1.0 \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR"

inherit rpm
