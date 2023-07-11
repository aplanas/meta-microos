SUMMARY = "Haskell http-client-tls library documentation"
DESCRIPTION = "This package provides the Haskell http-client-tls library documentation."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-doc-0.3.6.1-2.4.noarch.rpm"
RPM_HASH = "2a93590599465f050a1bfc58eaa6bdfd3506b1915394d6fc24d15245298a85d6fdd07b20b0753a99ef55d1dad463ac23e767dd229f4eb48aa78160581f02de86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
