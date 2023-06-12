SUMMARY = "Documentation for texlive-pst-rubans"
DESCRIPTION = "This package includes the documentation for texlive-pst-rubans"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-doc-2023.201.1.2svn23464-53.1.noarch.rpm"
RPM_HASH = "7c437a0d07b3fba988744b6ad7956c01e1e124721fe35ad2fe63667418bb789f533fb1c55d16c6a89c85be21fba4c4403891a24db427111d68b45a61620d6a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rubans-doc"
RDEPENDS:${PN} += ""

inherit rpm
