SUMMARY = "Haskell libmpd library documentation"
DESCRIPTION = "This package provides the Haskell libmpd library documentation."
LICENSE = "MIT"

PV = "0.10.0.0"

RPM_NAME = "ghc-libmpd-doc-0.10.0.0-2.8.noarch.rpm"
RPM_HASH = "2ee01d601d056d21f367a5d9fc8d03bbc32785dace0718d9765e34e946a4105634ec8e0d5f60c8d2daec7c159858fc19587ff8cfbe8282f4e791e6ba8ccf060f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-libmpd-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
