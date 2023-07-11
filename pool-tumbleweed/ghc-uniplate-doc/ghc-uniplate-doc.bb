SUMMARY = "Haskell uniplate library documentation"
DESCRIPTION = "This package provides the Haskell uniplate library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.13"

RPM_NAME = "ghc-uniplate-doc-1.6.13-4.6.noarch.rpm"
RPM_HASH = "b7562bc8733ea58abac1b72aae6d47c6d7e0be0c2666945caf2fb69bd5ae871d8833fc9455a57debad10e72ed8bac3d06c50e04cd1fd02a731e567cdf0b5759f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-uniplate-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
