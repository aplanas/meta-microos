SUMMARY = "Haskell persistent-sqlite library documentation"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library documentation."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-doc-2.13.1.1-2.4.noarch.rpm"
RPM_HASH = "81b73c783f7e41ed0fa3d3e9c9ae50e3db04aee4e109cbad95c578700a7e4231efd7e99d2c704147f167e49e6694416b075c273cf2e682f7225ae65a107f0da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-persistent-sqlite-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
