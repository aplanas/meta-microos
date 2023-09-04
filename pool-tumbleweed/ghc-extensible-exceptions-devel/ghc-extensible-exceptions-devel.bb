SUMMARY = "Haskell extensible-exceptions library development files"
DESCRIPTION = "This package provides the Haskell extensible-exceptions library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-devel-0.1.1.4-7.3.aarch64.rpm"
RPM_HASH = "95e5aea9d50903191c848f534052cf6aa8fc293fc43038c293d7a39bf3a641242d33962c9664a241e5ea559dafc6fec18149c74259d91c205ada31571823a60e"

RPROVIDES:${PN} += "ghc-devel-extensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e \
ghc-extensible-exceptions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-extensible-exceptions"

inherit rpm
