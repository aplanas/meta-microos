SUMMARY = "Haskell fdo-notify library development files"
DESCRIPTION = "This package provides the Haskell fdo-notify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-devel-0.3.1-4.10.aarch64.rpm"
RPM_HASH = "b8e0d9c7d274cafdb48bd48120aed888c627872f061a04424496fbd6d635852ea56096c4cb90ca1c6b8ff107d93aaf062ac14038517e6f89e2d5a2d6a30f52d3"

RPROVIDES:${PN} += "ghc-devel-fdo-notify-0.3.1-1GgkEz2BHJI1JvQlyWHJlU \
ghc-fdo-notify-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-dbus-1.2.29-4DkBnpH77ZuFg2GqtR0zJs \
ghc-fdo-notify"

inherit rpm
