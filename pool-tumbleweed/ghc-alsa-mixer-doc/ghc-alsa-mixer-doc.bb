SUMMARY = "Haskell alsa-mixer library documentation"
DESCRIPTION = "This package provides the Haskell alsa-mixer library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "ghc-alsa-mixer-doc-0.3.0-4.3.noarch.rpm"
RPM_HASH = "ef79bdf5090d62c65cbf117f76c9c5f8ca21ce1e02aa188ea40ab4641ee87ca5e3ef6f290fcec381a0fc6adfe40f6590f921f052a9072dad84222039876509d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-alsa-mixer-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
