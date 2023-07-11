SUMMARY = "Haskell asn1-parse library documentation"
DESCRIPTION = "This package provides the Haskell asn1-parse library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-doc-0.9.5-6.3.noarch.rpm"
RPM_HASH = "e0c9cfc35f0c432130f712253989fe26c352c722ec3cd3956b338390e372bf54903c161e3daf89f518afccf220b48d2444b97b4e93a53e5674906a5ccfa617b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-asn1-parse-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
