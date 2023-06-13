SUMMARY = "Documentation for texlive-leading"
DESCRIPTION = "This package includes the documentation for texlive-leading"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-leading-doc-2023.201.0.0.3svn15878-54.1.noarch.rpm"
RPM_HASH = "0e8743edc72afa44f83661de0632863b7dc33e422415440647391da49a6bf8ef47d0ce5da0b0defe22a6e62e8310bff37d457865b58aea5026681b6ada4f1d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leading-doc"

RDEPENDS:${PN} += ""

inherit rpm
