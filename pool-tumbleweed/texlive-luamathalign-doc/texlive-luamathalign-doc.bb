SUMMARY = "Documentation for texlive-luamathalign"
DESCRIPTION = "This package includes the documentation for texlive-luamathalign"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn63226"

RPM_NAME = "texlive-luamathalign-doc-2023.201.0.0.3svn63226-52.1.noarch.rpm"
RPM_HASH = "b79917a8fd2ecd791feb9d3683a0f0aef85f6eb67a05491dff0f718e656069faaa838aff0b190baf82a4ec9f821670cd535ef56a51a64b8e9e793d4f5b3de67f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamathalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
