SUMMARY = "Haskell tasty-hunit library documentation"
DESCRIPTION = "This package provides the Haskell tasty-hunit library documentation."
LICENSE = "MIT"

PV = "0.10.0.3"

RPM_NAME = "ghc-tasty-hunit-doc-0.10.0.3-2.3.noarch.rpm"
RPM_HASH = "0e7e6e2ad8468ba711cf4eaff49fde23c430115d213d2bda48ba54acaf1819a581f96519a83dace8207ab40c182a682783a4fbd89018f8d813d8d18519bd38b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-tasty-hunit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
