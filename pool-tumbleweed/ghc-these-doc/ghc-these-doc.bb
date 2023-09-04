SUMMARY = "Haskell these library documentation"
DESCRIPTION = "This package provides the Haskell these library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "ghc-these-doc-1.2-1.7.noarch.rpm"
RPM_HASH = "442723616155fa7c6bcd6aedea400c7c498f7cdcd083d0f24caa24de752da2ef1217bc720cc9c0b060ac9f774f3c0dde1517d093fbd6d9226cfbce8ececb5e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-these-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
