SUMMARY = "Documentation for texlive-proof-at-the-end"
DESCRIPTION = "This package includes the documentation for texlive-proof-at-the-end"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64188"

RPM_NAME = "texlive-proof-at-the-end-doc-2023.209.svn64188-53.1.noarch.rpm"
RPM_HASH = "f04bccef40868da5413a2bf9a93408de566bf51ae2806146343981b03ee390702918e9a6f6c86f63b292bdd9b3db1bb3ba9db3e08edb7bab03a4dce3a9ff0a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proof-at-the-end-doc"

RDEPENDS:${PN} += ""

inherit rpm
