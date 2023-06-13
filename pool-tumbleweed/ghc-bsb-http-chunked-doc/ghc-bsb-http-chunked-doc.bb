SUMMARY = "Haskell bsb-http-chunked library documentation"
DESCRIPTION = "This package provides the Haskell bsb-http-chunked library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.0.4"

RPM_NAME = "ghc-bsb-http-chunked-doc-0.0.0.4-6.2.noarch.rpm"
RPM_HASH = "257a1b9a969949bc4bea5c879993314e15cc454d7bbd82adb6f7d35e1fe4339230455655d098700f44d82effc516ce52786f610e0794e1924c6a3b2e1cc163f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-bsb-http-chunked-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
