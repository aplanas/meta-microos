SUMMARY = "Haskell bytestring library documentation"
DESCRIPTION = "This package provides the Haskell bytestring library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-doc-0.11.4.0-1.1.noarch.rpm"
RPM_HASH = "a937f2e5bcb62d55995559551c2614e5daa75231426f8174b966eabe15abd6a06c7f076a3c5d8e9dc2cc07dfbdc0ce0405632c9bf2f9d815ffd51dc5fef66ba7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bytestring-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
