SUMMARY = "Haskell http-date library documentation"
DESCRIPTION = "This package provides the Haskell http-date library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-doc-0.0.11-2.6.noarch.rpm"
RPM_HASH = "7564031ec3ea10d43e74454b214ee8ef5fa0b0aaba614a3683549283af4f333185cea6d8668ebf05cd629c68b49a9c7d271cfd2c5d2cd11cd122f098729619ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-date-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
