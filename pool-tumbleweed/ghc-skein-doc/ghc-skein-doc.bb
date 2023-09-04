SUMMARY = "Haskell skein library documentation"
DESCRIPTION = "This package provides the Haskell skein library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-doc-1.0.9.4-4.5.noarch.rpm"
RPM_HASH = "ebc51599e1568dd4bbfe4a6dddcd961c3ee4b3adcce6fc9a260a0de93c6272d821dab0658889bf94012fe746f1236bee1214b5c2a29ffa8094b691009706d27e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skein-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
