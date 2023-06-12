SUMMARY = "Documentation for texlive-xunicode"
DESCRIPTION = "This package includes the documentation for texlive-xunicode"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.981svn30466"

RPM_NAME = "texlive-xunicode-doc-2023.201.0.0.981svn30466-52.1.noarch.rpm"
RPM_HASH = "ec48d5dc10148f8ae38871ed69ec91bdafc61960e49ce8f88b144ebe1d57e9962fc4eaf276b74c393f063dead908b1cce96a5997dd4264314cac8e07a6bec934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xunicode-doc"
RDEPENDS:${PN} += ""

inherit rpm
