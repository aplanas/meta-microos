SUMMARY = "Haskell fdo-notify profiling library"
DESCRIPTION = "This package provides the Haskell fdo-notify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-prof-0.3.1-4.3.aarch64.rpm"
RPM_HASH = "b9facfb469d13b28fdb978855abeea18c9e4e59c130ccc44f6f79f6cebbd7a529dcb9d04400333b7f3fa48f68080c9e9d01fad20a9547b4ca38dcf6391d2f7ff"

RPROVIDES:${PN} += "ghc-fdo-notify-prof \
ghc-fdo-notify-prof(aarch-64) \
ghc-prof(fdo-notify-0.3.1-4juugYyFrKwHiJsjcNjTJW)"

RDEPENDS:${PN} += "ghc-fdo-notify-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(dbus-1.2.28-27GbkRPSCRwKgi0yxoNYFh)"

inherit rpm
