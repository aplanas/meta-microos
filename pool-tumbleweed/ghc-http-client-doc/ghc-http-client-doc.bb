SUMMARY = "Haskell http-client library documentation"
DESCRIPTION = "This package provides the Haskell http-client library documentation."
LICENSE = "MIT"

PV = "0.7.14"

RPM_NAME = "ghc-http-client-doc-0.7.14-1.1.noarch.rpm"
RPM_HASH = "7fe8bb7108f27251dfc25c0a78a56fa1c6c6f64121591a14f881ff5ca4b163206c57116aad12fefce482a2c1ac4f655161501bdda464be6911943e5073e96c27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
