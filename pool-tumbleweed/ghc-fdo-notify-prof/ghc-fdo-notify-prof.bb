SUMMARY = "Haskell fdo-notify profiling library"
DESCRIPTION = "This package provides the Haskell fdo-notify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-prof-0.3.1-4.10.aarch64.rpm"
RPM_HASH = "f5932181f87cdcc276b889b9e54e820cff1b626a03229b08a5b246fe8d66b1139149a9cb0d3d10073cc95cf5e3b91932350abe43759216204dd8bf6de1df3844"

RPROVIDES:${PN} += "ghc-fdo-notify-prof \
ghc-prof-fdo-notify-0.3.1-1GgkEz2BHJI1JvQlyWHJlU"

RDEPENDS:${PN} += "ghc-fdo-notify-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-dbus-1.2.29-4DkBnpH77ZuFg2GqtR0zJs"

inherit rpm
