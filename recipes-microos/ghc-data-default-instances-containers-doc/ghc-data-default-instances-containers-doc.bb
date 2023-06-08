SUMMARY = "Haskell data-default-instances-containers library documentation"
DESCRIPTION = "This package provides the Haskell data-default-instances-containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.1"

RPM_NAME = "ghc-data-default-instances-containers-doc-0.0.1-11.2.noarch.rpm"
RPM_HASH = "75389971ce2c5b320913cfb9e9663cafc4b36cda5fc89162fe09634c0bf8b3ae92caf4826135df4488fa04410d3c3047b7a522c6b5d8e298f3e2598fe6185739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-data-default-instances-containers-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
