SUMMARY = "Documentation for texlive-anonymous-acm"
DESCRIPTION = "This package includes the documentation for texlive-anonymous-acm"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55121"

RPM_NAME = "texlive-anonymous-acm-doc-2023.201.1.0svn55121-54.1.noarch.rpm"
RPM_HASH = "600087ba7c2c78e5713eb13658cc7b263f087f9712164c8217ad9fbadc12c79facd6cfb54516e14fa063be0a91baa1084a78e8b2478abba3e0b29b0c3ee9e7b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anonymous-acm-doc"

RDEPENDS:${PN} += ""

inherit rpm
