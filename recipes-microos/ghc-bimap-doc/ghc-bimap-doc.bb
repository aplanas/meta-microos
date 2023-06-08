SUMMARY = "Haskell bimap library documentation"
DESCRIPTION = "This package provides the Haskell bimap library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-doc-0.5.0-2.2.noarch.rpm"
RPM_HASH = "e99824868b4e2b6446e8819c0b48a153f066903988211bae4f0aacc53d2b25e735a109fdb7caf7029a7d6647909441f90609e8776232eb12b7cb032a3f106172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bimap-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
