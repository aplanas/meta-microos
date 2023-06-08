SUMMARY = "Haskell fdo-notify library development files"
DESCRIPTION = "This package provides the Haskell fdo-notify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-devel-0.3.1-4.3.aarch64.rpm"
RPM_HASH = "3561012fe185fdb54789f560392a1835d99c0372a53e809ef0ecaf96f3e427a332acc1be0c13da1e8dba1e28628a5c26e66d15ccd4eb16ee95a999219ca48234"

RPROVIDES:${PN} += "ghc-devel(fdo-notify-0.3.1-4juugYyFrKwHiJsjcNjTJW) ghc-fdo-notify-devel ghc-fdo-notify-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(dbus-1.2.28-27GbkRPSCRwKgi0yxoNYFh) ghc-fdo-notify"

inherit rpm
