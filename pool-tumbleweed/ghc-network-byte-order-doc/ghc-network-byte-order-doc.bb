SUMMARY = "Haskell network-byte-order library documentation"
DESCRIPTION = "This package provides the Haskell network-byte-order library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-network-byte-order-doc-0.1.6-4.3.noarch.rpm"
RPM_HASH = "8635f2a929001a66f62559ae3c1bed49820cc8626ee83057adeecee4b649ee7ce92edee68f36f65a40674f02ed530dc6aa798b2adbfe60f6d2a828658051b5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-byte-order-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
