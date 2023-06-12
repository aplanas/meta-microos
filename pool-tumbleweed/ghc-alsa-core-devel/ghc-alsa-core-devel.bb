SUMMARY = "Haskell alsa-core library development files"
DESCRIPTION = "This package provides the Haskell alsa-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-devel-0.5.0.1-4.2.aarch64.rpm"
RPM_HASH = "c8777669c0939c8032cdba498ef365f120445419a3edfe61bee62e00c0a4685a27e385099c5c13e091bbb209f966fd857c0519c03275e04839dcdb84e147b423"

RPROVIDES:${PN} += "ghc-alsa-core-devel \
ghc-alsa-core-devel(aarch-64) \
ghc-devel(alsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg)"
RDEPENDS:${PN} += "/bin/sh \
ghc-alsa-core \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY) \
pkgconfig \
pkgconfig(alsa)"

inherit rpm
