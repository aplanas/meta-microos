SUMMARY = "Haskell ansi-wl-pprint library development files"
DESCRIPTION = "This package provides the Haskell ansi-wl-pprint library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.9"

RPM_NAME = "ghc-ansi-wl-pprint-devel-0.6.9-11.2.aarch64.rpm"
RPM_HASH = "f84daacf93caf7908a373ecefade2e7a1648f901f9200feb54378808b9ef5d16b3a742f8b0394dcf988d0876df3bd0177ebbf0d2028dcaf4ffcbd13776da12f3"

RPROVIDES:${PN} += "ghc-ansi-wl-pprint-devel \
ghc-devel-ansi-wl-pprint-0.6.9-Akll4C7DaaL4wD8pj4jz8a"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-ansi-wl-pprint \
ghc-compiler \
ghc-devel-ansi-terminal-0.11.5-69CZC4XdNryJo9zHbgfvJ3 \
ghc-devel-base-4.17.2.0"

inherit rpm
